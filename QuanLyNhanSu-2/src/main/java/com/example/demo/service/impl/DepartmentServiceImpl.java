package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.model.DepartmentDto;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentRepository phongBanRepository;

	@Override
	public void addPhongBan(DepartmentDto phongBanDto) {
		Department phongBan = new Department();

		phongBan.setActive(phongBanDto.getActive());
		phongBan.setName(phongBanDto.getName());
		phongBanRepository.save(phongBan);

	}

	@Override
	public void updatePhongBan(DepartmentDto phongBanDto) {
		Department phongBan = phongBanRepository.getById(phongBanDto.getId());
		if (phongBan != null) {
			phongBan.setActive(phongBanDto.getActive());
			phongBan.setName(phongBanDto.getName());
			phongBanRepository.save(phongBan);
		}

	}

	@Override
	public void deletePhongBan(int mapb) {
		Department phongBan = phongBanRepository.getById(mapb);

		phongBanRepository.delete(phongBan);

	}

	@Override
	public DepartmentDto getPhongBanDtoByMapb(int mapb) {
		Department phongBan = phongBanRepository.getById(mapb);
		DepartmentDto phongBanDto = new DepartmentDto();
		phongBanDto.setActive(phongBan.getActive());
		phongBanDto.setId(phongBan.getId());
		phongBanDto.setName(phongBan.getName());
		;
		return phongBanDto;
	}

	@Override
	public List<DepartmentDto> getAllPhongBanDtos() {
		List<DepartmentDto> liPhongBanDtos = new ArrayList<DepartmentDto>();
		List<Department> getPhongBans = phongBanRepository.findAll();
		for (Department phongBan : getPhongBans) {
			DepartmentDto phongBanDto = new DepartmentDto();
			phongBanDto.setActive(phongBan.getActive());
			phongBanDto.setId(phongBan.getId());
			phongBanDto.setName(phongBan.getName());
			liPhongBanDtos.add(phongBanDto);
		}
		return liPhongBanDtos;
	}
}
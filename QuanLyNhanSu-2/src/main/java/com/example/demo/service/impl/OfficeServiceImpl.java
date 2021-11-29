package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Office;
import com.example.demo.model.OfficeDto;
import com.example.demo.repository.OfficeRepository;
import com.example.demo.service.OfficeService;

@Service
public class OfficeServiceImpl implements OfficeService {
	@Autowired
	OfficeRepository vanPhongRepository;

	@Override
	public void addVanPhong(OfficeDto vanPhongDto) {
		Office vanPhong = new Office();
		vanPhong.setActive(vanPhongDto.getActive());
		vanPhong.setAdress(vanPhongDto.getAddress());
		vanPhongRepository.save(vanPhong);
	}

	@Override
	public void updateVanPhong(OfficeDto vanPhongDto) {
		Office vanPhong = vanPhongRepository.getById(vanPhongDto.getId());
		if (vanPhong != null) {
			vanPhong.setActive(vanPhongDto.getActive());
			vanPhong.setAdress(vanPhongDto.getAddress());
			vanPhong.setId(vanPhongDto.getId());
			vanPhong.setName(vanPhongDto.getName());
			vanPhongRepository.save(vanPhong);
		}

	}

	@Override
	public void deleteVanPhong(int mavp) {
		Office vanPhong = vanPhongRepository.getById(mavp);
		vanPhongRepository.delete(vanPhong);

	}

	@Override
	public OfficeDto getVanPhongDto(int mavp) {
		Office vanPhong = vanPhongRepository.getById(mavp);
		OfficeDto vanPhongDto = new OfficeDto();
		vanPhongDto.setActive(vanPhong.getActive());
		vanPhongDto.setAddress(vanPhong.getAdress());
		vanPhongDto.setId(vanPhong.getId());
		vanPhongDto.setName(vanPhong.getName());
		return vanPhongDto;
	}

	@Override
	public List<OfficeDto> getAll() {
		List<Office> lisVanPhongs = vanPhongRepository.findAll();
		List<OfficeDto> lisVanPhongDtos = new ArrayList<OfficeDto>();
		for (Office vanPhong : lisVanPhongs) {
			OfficeDto vanPhongDto = new OfficeDto();
			vanPhongDto.setActive(vanPhong.getActive());
			vanPhongDto.setAddress(vanPhong.getAdress());
			vanPhongDto.setId(vanPhong.getId());
			vanPhongDto.setName(vanPhong.getName());
			lisVanPhongDtos.add(vanPhongDto);
		}
		return lisVanPhongDtos;
	}

}

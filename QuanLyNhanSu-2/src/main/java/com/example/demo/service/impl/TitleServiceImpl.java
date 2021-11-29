package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Title;
import com.example.demo.model.TitleDto;
import com.example.demo.repository.TitleRepository;
import com.example.demo.service.TitleService;

@Service
public class TitleServiceImpl implements TitleService {
	@Autowired
	TitleRepository chucDanhrepository;

	@Override
	public void addChucDanh(TitleDto chucDanhDto) {
		Title chucDanh = new Title();
		chucDanh.setActive(chucDanhDto.getActive());
		chucDanh.setName(chucDanhDto.getName());
		chucDanhrepository.save(chucDanh);
	}

	@Override
	public void updateChucDanh(TitleDto chucDanhDto) {
		Title chucDanh = chucDanhrepository.getById(chucDanhDto.getId());
		if (chucDanh != null) {
			chucDanh.setActive(chucDanhDto.getActive());
			chucDanh.setId(chucDanhDto.getId());
			chucDanh.setName(chucDanhDto.getName());
			chucDanhrepository.save(chucDanh);
		}

	}

	@Override
	public void deleteChucDanh(int macd) {
		Title title = chucDanhrepository.getById(macd);
		chucDanhrepository.delete(title);
	}

	@Override
	public TitleDto getChucDanhDto(int macd) {
		TitleDto titleDto = new TitleDto();
		Title title = chucDanhrepository.getById(macd);
		titleDto.setActive(title.getActive());
		titleDto.setId(title.getId());
		titleDto.setName(title.getName());
		return titleDto;
	}

	@Override
	public List<TitleDto> getLisChucDanhDtos() {
		List<Title> getLiTitles = chucDanhrepository.findAll();
		List<TitleDto> getLiTitleDtos = new ArrayList<TitleDto>();
		for (Title title : getLiTitles) {
			TitleDto titleDto = new TitleDto();
			titleDto.setActive(title.getActive());
			titleDto.setId(title.getId());
			titleDto.setName(title.getName());
			getLiTitleDtos.add(titleDto);
		}
		return getLiTitleDtos;
	}

}

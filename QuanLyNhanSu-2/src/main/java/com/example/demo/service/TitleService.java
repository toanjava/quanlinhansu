package com.example.demo.service;

import java.util.List;

import com.example.demo.model.TitleDto;

public interface TitleService {
	public void addChucDanh(TitleDto chucDanhDto);

	public void updateChucDanh(TitleDto chucDanhDto);

	public void deleteChucDanh(int macd);

	public TitleDto getChucDanhDto(int macd);

	public List<TitleDto> getLisChucDanhDtos();
}

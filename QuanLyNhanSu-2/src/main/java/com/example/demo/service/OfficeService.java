package com.example.demo.service;

import java.util.List;

import com.example.demo.model.OfficeDto;

public interface OfficeService {
	public void addVanPhong(OfficeDto vanPhongDto);

	public void updateVanPhong(OfficeDto vanPhongDto);

	public void deleteVanPhong(int mavp);

	public OfficeDto getVanPhongDto(int mavp);

	public List<OfficeDto> getAll();

}

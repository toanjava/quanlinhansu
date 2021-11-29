package com.example.demo.service;

import java.util.List;

import com.example.demo.model.DepartmentDto;

public interface DepartmentService {
	public void addPhongBan(DepartmentDto phongBanDto);

	public void updatePhongBan(DepartmentDto phongBanDto);

	public void deletePhongBan(int mapb);

	public DepartmentDto getPhongBanDtoByMapb(int mapb);

	public List<DepartmentDto> getAllPhongBanDtos();

}

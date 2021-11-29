package com.example.demo.service;

import java.util.List;

import com.example.demo.model.EmployeeDto;

public interface EmployeeService {
	public void addNhanVien(EmployeeDto nhanVienDto);

	public void updateNhaVien(EmployeeDto nhanVienDto);

	public void deleteNhanVien(int manv);

	public EmployeeDto getNhanVienDtobyManv(int manv);

	public List<EmployeeDto> getAll();

}

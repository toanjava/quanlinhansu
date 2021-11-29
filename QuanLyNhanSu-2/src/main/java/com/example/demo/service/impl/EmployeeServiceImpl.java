package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.model.EmployeeDto;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository nhanVienRepository;

	@Override
	public void addNhanVien(EmployeeDto employeeDto) {
		Employee nhanVien = new Employee();
		nhanVien.setActive(1);
		nhanVien.setCitizenid(employeeDto.getCitizenid());
		nhanVien.setPosition(employeeDto.getPosition());
		nhanVien.setWagepolicy(employeeDto.getWagepolicy());
		nhanVien.setEthnic(employeeDto.getEthnic());
		nhanVien.setPermanentaddress(employeeDto.getPermanentaddress());
		nhanVien.setAddress(employeeDto.getAddress());
		nhanVien.setEmail(employeeDto.getEmail());
		nhanVien.setGender(employeeDto.getGender());
		nhanVien.setImage(employeeDto.getImage());
		nhanVien.setExperience(employeeDto.getExperience());
		nhanVien.setBasicsalary(employeeDto.getBasicsalary());
		nhanVien.setActualsalary(employeeDto.getActualsalary());
		nhanVien.setBirthday(employeeDto.getBirthday());
		nhanVien.setWorkingday(employeeDto.getWorkingday());
		nhanVien.setPlacebirth(employeeDto.getPlacebirth());
		nhanVien.setDepartmentname(employeeDto.getDepartmentname());
		nhanVien.setNativecountry(employeeDto.getNativecountry());
		nhanVien.setNationality(employeeDto.getNationality());
		nhanVien.setPhonenumber(employeeDto.getPhonenumber());
		nhanVien.setName(employeeDto.getName());
		nhanVien.setSeniority(employeeDto.getSeniority());
		nhanVien.setReligion(employeeDto.getReligion());
		nhanVien.setEducational(employeeDto.getEducational());
		nhanVien.setAcademic(employeeDto.getAcademic());
		nhanVien.setMarriage(employeeDto.getMarriage());

		nhanVienRepository.save(nhanVien);
	}

	@Override
	public void updateNhaVien(EmployeeDto employeeDto) {
		Employee nhanVien = nhanVienRepository.getById(employeeDto.getId());
		if (nhanVien != null) {
			nhanVien = new Employee();
			nhanVien.setId(employeeDto.getId());
			nhanVien.setCitizenid(employeeDto.getCitizenid());
			nhanVien.setPosition(employeeDto.getPosition());
			nhanVien.setWagepolicy(employeeDto.getWagepolicy());
			nhanVien.setEthnic(employeeDto.getEthnic());
			nhanVien.setPermanentaddress(employeeDto.getPermanentaddress());
			nhanVien.setAddress(employeeDto.getAddress());
			nhanVien.setEmail(employeeDto.getEmail());
			nhanVien.setGender(employeeDto.getGender());
			nhanVien.setImage(employeeDto.getImage());
			nhanVien.setExperience(employeeDto.getExperience());
			nhanVien.setBasicsalary(employeeDto.getBasicsalary());
			nhanVien.setActualsalary(employeeDto.getActualsalary());
			nhanVien.setBirthday(employeeDto.getBirthday());
			nhanVien.setWorkingday(employeeDto.getWorkingday());
			nhanVien.setPlacebirth(employeeDto.getPlacebirth());
			nhanVien.setDepartmentname(employeeDto.getDepartmentname());
			nhanVien.setNativecountry(employeeDto.getNativecountry());
			nhanVien.setNationality(employeeDto.getNationality());
			nhanVien.setPhonenumber(employeeDto.getPhonenumber());
			nhanVien.setName(employeeDto.getName());
			nhanVien.setSeniority(employeeDto.getSeniority());
			nhanVien.setReligion(employeeDto.getReligion());
			nhanVien.setEducational(employeeDto.getEducational());
			nhanVien.setAcademic(employeeDto.getAcademic());
			nhanVien.setMarriage(employeeDto.getMarriage());
			nhanVienRepository.save(nhanVien);
		}
	}

	@Override
	public void deleteNhanVien(int manv) {
		Employee nhanVien = nhanVienRepository.getById(manv);
		nhanVienRepository.delete(nhanVien);

	}

//	@Override
//	public EmployeeDto getemployeeDtobyManv(int manv) {
//		Employee nhanVien = nhanVienRepository.getById(manv);
//		EmployeeDto employeeDto = new EmployeeDto();
//		employeeDto.setManv(nhanVien.getManv());
//		employeeDto.setActive(nhanVien.getActive());
//		employeeDto.setCccd(nhanVien.getCccd());
//		employeeDto.setChucdanh(nhanVien.getChucdanh());
//		employeeDto.setCsluong(nhanVien.getCsluong());
//		employeeDto.setDantoc(nhanVien.getDantoc());
//		employeeDto.setDclienhe(nhanVien.getDclienhe());
//		employeeDto.setDiachi(nhanVien.getDiachi());
//		employeeDto.setEmail(nhanVien.getEmail());
//		employeeDto.setGioitinh(nhanVien.getGioitinh());
//		employeeDto.setImage(nhanVien.getImage());
//		employeeDto.setKnlamviec(nhanVien.getKnlamviec());
//		employeeDto.setLuongcoban(nhanVien.getLuongcoban());
//		employeeDto.setLuongthuc(nhanVien.getLuongthuc());
//		employeeDto.setNgaysinh(nhanVien.getNgaysinh());
//		employeeDto.setNgayvaolam(nhanVien.getNgayvaolam());
//		employeeDto.setNoisinh(nhanVien.getNoisinh());
//		employeeDto.setPhongban(nhanVien.getPhongban());
//		employeeDto.setQuequan(nhanVien.getQuequan());
//		employeeDto.setQuoctich(nhanVien.getQuoctich());
//		employeeDto.setSdt(nhanVien.getSdt());
//		employeeDto.setTennv(nhanVien.getTennv());
//		employeeDto.setThamnien(nhanVien.getThamnien());
//		employeeDto.setTongiao(nhanVien.getTongiao());
//		employeeDto.setTrinhdohv(nhanVien.getTrinhdohv());
//		employeeDto.setTrinhdovh(nhanVien.getTrinhdovh());
//		employeeDto.setTthn(nhanVien.getTthn());
//
//		return employeeDto;
//	}

	@Override
	public List<EmployeeDto> getAll() {
		List<EmployeeDto> lisemployeeDtos = new ArrayList<EmployeeDto>();
		List<Employee> liNhanViens = nhanVienRepository.findAll();
		for (Employee employeeDto : liNhanViens) {
			EmployeeDto nhanVien = new EmployeeDto();
			nhanVien.setId(employeeDto.getId());
			nhanVien.setCitizenid(employeeDto.getCitizenid());
			nhanVien.setPosition(employeeDto.getPosition());
			nhanVien.setWagepolicy(employeeDto.getWagepolicy());
			nhanVien.setEthnic(employeeDto.getEthnic());
			nhanVien.setPermanentaddress(employeeDto.getPermanentaddress());
			nhanVien.setAddress(employeeDto.getAddress());
			nhanVien.setEmail(employeeDto.getEmail());
			nhanVien.setGender(employeeDto.getGender());
			nhanVien.setImage(employeeDto.getImage());
			nhanVien.setExperience(employeeDto.getExperience());
			nhanVien.setBasicsalary(employeeDto.getBasicsalary());
			nhanVien.setActualsalary(employeeDto.getActualsalary());
			nhanVien.setBirthday(employeeDto.getBirthday());
			nhanVien.setWorkingday(employeeDto.getWorkingday());
			nhanVien.setPlacebirth(employeeDto.getPlacebirth());
			nhanVien.setDepartmentname(employeeDto.getDepartmentname());
			nhanVien.setNativecountry(employeeDto.getNativecountry());
			nhanVien.setNationality(employeeDto.getNationality());
			nhanVien.setPhonenumber(employeeDto.getPhonenumber());
			nhanVien.setName(employeeDto.getName());
			nhanVien.setSeniority(employeeDto.getSeniority());
			nhanVien.setReligion(employeeDto.getReligion());
			nhanVien.setEducational(employeeDto.getEducational());
			nhanVien.setAcademic(employeeDto.getAcademic());
			nhanVien.setMarriage(employeeDto.getMarriage());
			nhanVien.setActive(employeeDto.getActive());
			lisemployeeDtos.add(nhanVien);
		}

		return lisemployeeDtos;
	}

	@Override
	public EmployeeDto getNhanVienDtobyManv(int manv) {
		Employee employeeDto = nhanVienRepository.getById(manv);
		EmployeeDto nhanVien = new EmployeeDto();
		nhanVien.setId(employeeDto.getId());
		nhanVien.setCitizenid(employeeDto.getCitizenid());
		nhanVien.setPosition(employeeDto.getPosition());
		nhanVien.setWagepolicy(employeeDto.getWagepolicy());
		nhanVien.setEthnic(employeeDto.getEthnic());
		nhanVien.setPermanentaddress(employeeDto.getPermanentaddress());
		nhanVien.setAddress(employeeDto.getAddress());
		nhanVien.setEmail(employeeDto.getEmail());
		nhanVien.setGender(employeeDto.getGender());
		nhanVien.setImage(employeeDto.getImage());
		nhanVien.setExperience(employeeDto.getExperience());
		nhanVien.setBasicsalary(employeeDto.getBasicsalary());
		nhanVien.setActualsalary(employeeDto.getActualsalary());
		nhanVien.setBirthday(employeeDto.getBirthday());
		nhanVien.setWorkingday(employeeDto.getWorkingday());
		nhanVien.setPlacebirth(employeeDto.getPlacebirth());
		nhanVien.setDepartmentname(employeeDto.getDepartmentname());
		nhanVien.setNativecountry(employeeDto.getNativecountry());
		nhanVien.setNationality(employeeDto.getNationality());
		nhanVien.setPhonenumber(employeeDto.getPhonenumber());
		nhanVien.setName(employeeDto.getName());
		nhanVien.setSeniority(employeeDto.getSeniority());
		nhanVien.setReligion(employeeDto.getReligion());
		nhanVien.setEducational(employeeDto.getEducational());
		nhanVien.setAcademic(employeeDto.getAcademic());
		nhanVien.setMarriage(employeeDto.getMarriage());
		nhanVien.setActive(employeeDto.getActive());
		return nhanVien;
	}

}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DepartmentDto;
import com.example.demo.service.DepartmentService;

@RestController
@CrossOrigin("*")
public class PhongBanAPIController {
	@Autowired
	DepartmentService phongBanService;

	@GetMapping("/phongbans")
	public List<DepartmentDto> getAllPhongBan() {
		return phongBanService.getAllPhongBanDtos();
	}

	@GetMapping("phongban/{mapb}")
	public DepartmentDto getPhongBanDto(@PathVariable("mapb") int mapb) {
		DepartmentDto phongBanDto = phongBanService.getPhongBanDtoByMapb(mapb);
		return phongBanDto;
	}

	@DeleteMapping("/phongban/{mapb}")
	public void deletePhongBanDto(@PathVariable("mapb") int mapb) {
		phongBanService.deletePhongBan(mapb);
	}

	@PostMapping("/phongban")
	public void addPhongBanDto(@RequestBody DepartmentDto phongBanDto) {

		phongBanService.addPhongBan(phongBanDto);
	}

	@PutMapping("/phongban")
	public void updatePhongBanDto(@RequestBody DepartmentDto phongBanDto) {
		phongBanService.updatePhongBan(phongBanDto);
	}

}

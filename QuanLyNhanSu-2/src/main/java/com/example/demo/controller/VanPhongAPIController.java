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

import com.example.demo.model.OfficeDto;
import com.example.demo.service.OfficeService;

@RestController
@CrossOrigin("*")
public class VanPhongAPIController {
	@Autowired
	OfficeService vanPhongService;

	@GetMapping("/vanphongs")
	public List<OfficeDto> getAll() {
		List<OfficeDto> liVanPhongDtos = vanPhongService.getAll();
		return liVanPhongDtos;
	}

	@GetMapping("/vanphong/{mavp}")
	public OfficeDto getVanPhongDto(@PathVariable("mavp") int mavp) {
		OfficeDto vanPhongDto = vanPhongService.getVanPhongDto(mavp);
		return vanPhongDto;
	}

	@PostMapping("/vanphong")
	public void addVanPhong(@RequestBody OfficeDto vanPhongDto) {
		vanPhongService.addVanPhong(vanPhongDto);
	}

	@PutMapping("/vanphong")
	public void updateVanPhong(@RequestBody OfficeDto vanPhongDto) {
		vanPhongService.updateVanPhong(vanPhongDto);
	}

	@DeleteMapping("/vanphong/{mavp}")
	public void deleteVanPhong(@PathVariable("mavp") int mavp) {
		vanPhongService.deleteVanPhong(mavp);
	}

}

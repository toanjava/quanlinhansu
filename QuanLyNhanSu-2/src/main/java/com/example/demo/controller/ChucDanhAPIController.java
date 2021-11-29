package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TitleDto;
import com.example.demo.service.TitleService;

@RestController
@CrossOrigin("*")
public class ChucDanhAPIController {
	@Autowired
	TitleService titleService;
	@GetMapping("/chucdanhs")
	public List<TitleDto> ListTitle() {
		return titleService.getLisChucDanhDtos();
	}
}

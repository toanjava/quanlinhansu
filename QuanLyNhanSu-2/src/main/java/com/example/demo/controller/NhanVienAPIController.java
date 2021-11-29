package com.example.demo.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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

import com.example.demo.model.EmployeeDto;
import com.example.demo.service.EmployeeService;

@RestController
@CrossOrigin("*")
public class NhanVienAPIController {
	@Autowired
	EmployeeService nhanVienService;

	@GetMapping("/nhanviens")
	public List<EmployeeDto> getAllNhanVien() {
		List<EmployeeDto> lisNhanVienDtos = nhanVienService.getAll();
		return lisNhanVienDtos;
	}

	@GetMapping("/nhanvien/{manv}")
	public EmployeeDto getNhanVien(@PathVariable("manv") int manv) {
		return nhanVienService.getNhanVienDtobyManv(manv);
	}

	@PostMapping("/nhanvien")
	public void addNhanVienDto(@RequestBody EmployeeDto nhanVienDto) {
	
		String nameFile = nhanVienDto.getFile().getOriginalFilename();
		int posEnd = nameFile.lastIndexOf(".");
		String ext = nameFile.substring(posEnd);
		System.out.println("e+" + ext);
		String nameNewFile = System.currentTimeMillis() + ext;
		System.out.println("tên +" + nameNewFile);

		try {
			File f = new File("E:\\Git\\tailieucode\\QuanLyNhanSu-2\\src\\main\\resources\\static\\img\\"
					+ nameNewFile);

			FileOutputStream fileOutputStream = new FileOutputStream(f);
			fileOutputStream.write(nhanVienDto.getFile().getBytes());
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		nhanVienDto.setImage(nameNewFile);
		nhanVienService.addNhanVien(nhanVienDto);
	}

	@PutMapping("/nhanvien")
	public void updateNhanVien(@RequestBody EmployeeDto nhanVienDto) {
		nhanVienService.updateNhaVien(nhanVienDto);
	}
	@DeleteMapping("/nhanvien/{manv}")
	public void deleteNhanVien(@PathVariable("manv") int manv) {
		nhanVienService.deleteNhanVien(manv);
	}
}

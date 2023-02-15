package com.map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.map.config.Mapper;
import com.map.model.Admin;
import com.map.model.AdminDTO;

@RestController
public class AdminController {
	@Autowired
	private Mapper mapper;
	
	@GetMapping("data")
    ResponseEntity<AdminDTO> retrive(){
	Admin admin = new Admin();
	admin.setAbout("java developer");
	admin.setName("suresh");
	admin.setPassword("abcd");
	
	/*AdminDTO dto = new AdminDTO();
	dto.setAbout(admin.getAbout());
	dto.setName(admin.getName());*/
	
	 AdminDTO dto = mapper.adminToAdminDto(admin);
	return new ResponseEntity<>(dto,HttpStatus.ACCEPTED);
}
}

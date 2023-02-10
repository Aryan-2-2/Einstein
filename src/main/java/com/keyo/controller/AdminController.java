package com.keyo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keyo.DTO.AdminDTO;
import com.keyo.entites.Admin;
import com.keyo.service.ModelMapperServiceImpl;
import static com.keyo.constant.Constant.*;
@RestController()
@RequestMapping("admin")
public class AdminController {

	
	@Autowired
	private ModelMapperServiceImpl modelMapperService;
	
	@GetMapping(value = ADMIN_ONE)
	public ResponseEntity<AdminDTO> getAdminDetails(){
		Admin admin = new Admin();
		String randomAdminId = UUID.randomUUID().toString();
	    admin.setAdminId(randomAdminId);
	    admin.setName("Suresh");
	    admin.setAbout("Java Developer");
	    admin.setPassword("brajkishor");
		
		AdminDTO dto = modelMapperService.adminToDto(admin);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	    
	}
	
}

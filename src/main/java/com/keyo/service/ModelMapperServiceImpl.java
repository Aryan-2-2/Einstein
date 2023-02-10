package com.keyo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keyo.DTO.AdminDTO;
import com.keyo.entites.Admin;

@Service
public class ModelMapperServiceImpl implements ModelMapperIntr{
    
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public AdminDTO adminToDto(Admin admin) {
	   return   this.modelMapper.map(admin, AdminDTO.class);
	}

	@Override
	public Admin adminDtoToAdmin(AdminDTO adminDTO) {
		return this.modelMapper.map(adminDTO, Admin.class);
	}

}

package com.keyo.service;

import com.keyo.DTO.AdminDTO;
import com.keyo.entites.Admin;


public interface ModelMapperIntr{
	public AdminDTO adminToDto(Admin admin);
	public Admin adminDtoToAdmin(AdminDTO adminDTO);
}

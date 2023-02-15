package com.map.config;


import com.map.model.Admin;
import com.map.model.AdminDTO;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {
 AdminDTO adminToAdminDto(Admin admin);
 Admin adminDtoToAdmin(AdminDTO adminDto);
}

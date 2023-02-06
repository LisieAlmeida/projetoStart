package com.capgemini.start.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.capgemini.start.api.dto.input.UserInputDTO;
import com.capgemini.start.api.dto.output.UserDTO;
import com.capgemini.start.domain.entity.User;



@Component
@Mapper(componentModel = "spring")
public interface UserMapper {

	UserDTO toDTO(User user);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "dataCriacao", ignore = true)
	@Mapping(target = "dataAlteracao", ignore = true)
	User toEntity(UserInputDTO user);

}
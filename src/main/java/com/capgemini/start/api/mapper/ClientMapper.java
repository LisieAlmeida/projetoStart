package com.capgemini.start.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.capgemini.start.api.dto.input.ClientInputDTO;
import com.capgemini.start.api.dto.output.ClientDTO;
import com.capgemini.start.domain.entity.Client;






@Component
@Mapper(componentModel = "spring")
public interface ClientMapper {

	ClientDTO toDTO(Client client);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "dataCriacao", ignore = true)
	@Mapping(target = "dataAlteracao", ignore = true)
	Client toEntity(ClientInputDTO client);

}
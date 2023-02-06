package com.capgemini.start.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.capgemini.start.api.dto.input.ProductInputDTO;
import com.capgemini.start.api.dto.output.ProductDTO;
import com.capgemini.start.domain.entity.Product;



@Component
@Mapper(componentModel = "spring")
public interface ProductMapper {

	ProductDTO toDTO(Product product);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "dataCriacao", ignore = true)
	@Mapping(target = "dataAlteracao", ignore = true)
	Product toEntity(ProductInputDTO tipo);

}
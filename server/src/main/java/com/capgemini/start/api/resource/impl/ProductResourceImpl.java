package com.capgemini.start.api.resource.impl;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.capgemini.start.api.dto.input.ProductInputDTO;
import com.capgemini.start.api.dto.output.ProductDTO;
import com.capgemini.start.api.mapper.ProductMapper;
import com.capgemini.start.api.resource.ProductResource;
import com.capgemini.start.domain.entity.Product;
import com.capgemini.start.domain.service.ProductService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/products")
public class ProductResourceImpl implements ProductResource{
	
	private final ProductService service;
	
	@Autowired
	private ProductMapper mapper;
	
	@Override
	public ResponseEntity<ProductDTO> findById(Long id) {
		Product product = this.service.findById(id);
		ProductDTO dto = mapper.toDTO(product);
		return ResponseEntity.ok(dto);
	}

	@Override
	public ResponseEntity<List<ProductDTO>> findAll() {
		return ResponseEntity.ok(
					this.service.findAll()
					.stream()
					.map(product -> mapper.toDTO(product))
					.collect(Collectors.toList())
				);
	}

	@Override
	public ResponseEntity<ProductDTO> insert(@RequestBody @Valid ProductInputDTO product) {
		Product entity = mapper.toEntity(product);
		Product createdEntity = this.service.insert(entity);
		
		URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdEntity.getId())
                .toUri();

		return ResponseEntity.status(HttpStatus.CREATED).header(HttpHeaders.LOCATION, location.toString()).body(mapper.toDTO(createdEntity));
		
	}

	@Override
	public ResponseEntity<ProductDTO> update(Long id, @Valid ProductInputDTO product) {
		Product toUpdate = this.service.findById(id);
		toUpdate.setName(product.getName());
		toUpdate.setDescricao(product.getDescricao());
		toUpdate.setPrice(product.getPrice());
		toUpdate.setImgUrl(product.getImgUrl());
		
		Product updated = this.service.update(toUpdate);
		return ResponseEntity.ok(mapper.toDTO(updated));
	}

	@Override
	public ResponseEntity<Void> delete(Long id) {
		this.service.delete(id);;
		return ResponseEntity.ok().build();
	}

	
	
}
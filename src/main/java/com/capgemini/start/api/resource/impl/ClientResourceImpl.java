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

import com.capgemini.start.api.dto.input.ClientInputDTO;
import com.capgemini.start.api.dto.output.ClientDTO;
import com.capgemini.start.api.mapper.ClientMapper;
import com.capgemini.start.api.resource.ClientResource;
import com.capgemini.start.domain.entity.Client;
import com.capgemini.start.domain.service.ClientService;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/clients")
public class ClientResourceImpl implements ClientResource{
	
	private final ClientService service;
	
	@Autowired
	private ClientMapper mapper;
	
	@Override
	public ResponseEntity<ClientDTO> findById(Long id) {
		Client client = this.service.findById(id);
		ClientDTO dto = mapper.toDTO(client);
		return ResponseEntity.ok(dto);
	}

	@Override
	public ResponseEntity<List<ClientDTO>> findAll() {
		return ResponseEntity.ok(
					this.service.findAll()
					.stream()
					.map(client -> mapper.toDTO(client))
					.collect(Collectors.toList())
				);
	}

	@Override
	public ResponseEntity<ClientDTO> insert(@RequestBody @Valid ClientInputDTO client) {
		Client entity = mapper.toEntity(client);
		Client createdEntity = this.service.insert(entity);
		
		URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdEntity.getId())
                .toUri();

		return ResponseEntity.status(HttpStatus.CREATED).header(HttpHeaders.LOCATION, location.toString()).body(mapper.toDTO(createdEntity));
		
	}

	@Override
	public ResponseEntity<ClientDTO> update(Long id, @Valid ClientInputDTO client) {
		Client toUpdate = this.service.findById(id);
		toUpdate.setCpf(client.getCpf());
		toUpdate.setName(client.getName());
		toUpdate.setEmail(client.getEmail());
		toUpdate.setAdress(client.getAdress());
		toUpdate.setPhone(client.getPhone());
		
		Client updated = this.service.update(toUpdate);
		return ResponseEntity.ok(mapper.toDTO(updated));
	}

	@Override
	public ResponseEntity<Void> delete(Long id) {
		this.service.delete(id);
		return ResponseEntity.ok().build();
	}

	
	
}
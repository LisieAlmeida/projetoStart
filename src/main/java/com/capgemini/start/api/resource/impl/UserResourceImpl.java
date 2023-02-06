package com.capgemini.start.api.resource.impl;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.capgemini.start.api.dto.input.UserInputDTO;
import com.capgemini.start.api.dto.output.UserDTO;
import com.capgemini.start.api.mapper.UserMapper;
import com.capgemini.start.api.resource.UserResource;
import com.capgemini.start.domain.entity.User;
import com.capgemini.start.domain.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource{
	
	private final UserService service;
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public ResponseEntity<UserDTO> findById(Long id) {
		User user = this.service.findById(id);
		UserDTO dto = mapper.toDTO(user);
		return ResponseEntity.ok(dto);
	}

	@Override
	public ResponseEntity<List<UserDTO>> findAll() {
		return ResponseEntity.ok(
					this.service.findAll()
					.stream()
					.map(user -> mapper.toDTO(user))
					.collect(Collectors.toList())
				);
	}

	@Override
	public ResponseEntity<UserDTO> insert(@RequestBody @Valid UserInputDTO user) {
		User entity = mapper.toEntity(user);
		User createdEntity = this.service.insert(entity);
		
		URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdEntity.getId())
                .toUri();

		return ResponseEntity.status(HttpStatus.CREATED).header(HttpHeaders.LOCATION, location.toString()).body(mapper.toDTO(createdEntity));
		
	}

	@Override
	public ResponseEntity<UserDTO> update(Long id, @Valid UserInputDTO user) {
		User toUpdate = this.service.findById(id);
		toUpdate.setName(user.getName());
		toUpdate.setEmail(user.getEmail());
		toUpdate.setPassword(user.getPassword());
		
		User updated = this.service.update(toUpdate);
		return ResponseEntity.ok(mapper.toDTO(updated));
	}

	@Override
	public ResponseEntity<Void> delete(Long id) {
		this.service.delete(id);
		return ResponseEntity.ok().build();
	}

	
	
}
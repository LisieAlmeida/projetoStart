package com.capgemini.start.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.start.api.dto.input.UserInputDTO;
import com.capgemini.start.api.dto.output.UserDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "User", description = "Usuário")
public interface UserResource {
	
	@Operation(summary = "Consulta um usuário por id")
	@GetMapping(value = "/{id}")
	ResponseEntity<UserDTO> findById(@PathVariable Long id);
	
	@Operation(summary = "Lista todos os usuários")
	@GetMapping()
	ResponseEntity<List<UserDTO>> findAll();
	
	@Operation(summary = "Insere um usuário")
	@PostMapping()
	ResponseEntity<UserDTO> insert(@RequestBody @Valid UserInputDTO user);
	
	@Operation(summary = "Atualiza um usuário")
	@PutMapping(value = "/{id}")
	ResponseEntity<UserDTO> update(@PathVariable Long id, @RequestBody @Valid UserInputDTO user);
	
	@Operation(summary = "Exclui um usuário pelo id")
	@DeleteMapping(value = "/{id}")
	ResponseEntity<Void> delete(@PathVariable Long id);

}

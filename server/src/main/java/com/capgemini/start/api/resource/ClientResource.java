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

import com.capgemini.start.api.dto.input.ClientInputDTO;
import com.capgemini.start.api.dto.output.ClientDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Client", description = "Cliente")
public interface ClientResource {
	
	@Operation(summary = "Consulta um cliente por id")
	@GetMapping(value = "/{id}")
	ResponseEntity<ClientDTO> findById(@PathVariable Long id);
	
	@Operation(summary = "Lista todos os clientes")
	@GetMapping()
	ResponseEntity<List<ClientDTO>> findAll();
	
	@Operation(summary = "Insere um clientes")
	@PostMapping()
	ResponseEntity<ClientDTO> insert(@RequestBody @Valid ClientInputDTO client);
	
	@Operation(summary = "Atualiza um clientes")
	@PutMapping(value = "/{id}")
	ResponseEntity<ClientDTO> update(@PathVariable Long id, @RequestBody @Valid ClientInputDTO client);
	
	@Operation(summary = "Exclui um cliente pelo id")
	@DeleteMapping(value = "/{id}")
	ResponseEntity<Void> delete(@PathVariable Long id);

}

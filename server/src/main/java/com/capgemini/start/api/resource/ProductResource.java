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

import com.capgemini.start.api.dto.input.ProductInputDTO;
import com.capgemini.start.api.dto.output.ProductDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Product", description = "Product")
public interface ProductResource {
	
	@Operation(summary = "Consulta um produto por id")
	@GetMapping(value = "/{id}")
	ResponseEntity<ProductDTO> findById(@PathVariable Long id);
	
	@Operation(summary = "Lista todos os produtos")
	@GetMapping()
	ResponseEntity<List<ProductDTO>> findAll();
	
	@Operation(summary = "Insere um produto")
	@PostMapping()
	ResponseEntity<ProductDTO> insert(@RequestBody @Valid ProductInputDTO product);
	
	@Operation(summary = "Atualiza um produto")
	@PutMapping(value = "/{id}")
	ResponseEntity<ProductDTO> update(@PathVariable Long id, @RequestBody @Valid ProductInputDTO product);
	
	@Operation(summary = "Exclui um produto pelo id")
	@DeleteMapping(value = "/{id}")
	ResponseEntity<Void> delete(@PathVariable Long id);

}

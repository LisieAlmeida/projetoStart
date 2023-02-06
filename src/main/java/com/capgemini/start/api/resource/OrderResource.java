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

import com.capgemini.start.domain.entity.Order;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Orders", description = "Orders")
public interface OrderResource {
	
	@Operation(summary = "Consulta um pedido por id")
	@GetMapping(value = "/{id}")
	ResponseEntity<Order> findById(@PathVariable Long id);
	
	@Operation(summary = "Lista todos os pedidos")
	@GetMapping()
	ResponseEntity<List<Order>> findAll();
	

}

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

import com.capgemini.start.api.resource.OrderResource;
import com.capgemini.start.domain.entity.Order;
import com.capgemini.start.domain.service.OrderService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/orders")
public class OrderResourceImpl implements OrderResource{
	
	@Autowired
	private final OrderService service;
	
	
	@Override
	public ResponseEntity<Order> findById(Long id) {
		Order order = this.service.findById(id);
		return ResponseEntity.ok(order);
	}

	@Override
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok(list);
	}

	
	
	
}
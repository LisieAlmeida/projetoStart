package com.capgemini.start.domain.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capgemini.start.domain.entity.Order;
import com.capgemini.start.domain.repository.OrderRepository;
import com.capgemini.start.domain.service.exceptions.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OrderService extends AbstractService<Order, Long> {
	
	private final OrderRepository repository;
	
	@Override
	protected JpaRepository<Order, Long> getRepository() {
		return this.repository;
	}
	
	@Override
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Order findById(Long id){
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Pedido não encontrado"));
	}
	
	

}

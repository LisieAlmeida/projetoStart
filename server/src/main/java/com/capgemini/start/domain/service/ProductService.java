package com.capgemini.start.domain.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capgemini.start.domain.entity.Product;
import com.capgemini.start.domain.repository.ProductRepository;
import com.capgemini.start.domain.service.exceptions.ObjectAlreadyExistsException;
import com.capgemini.start.domain.service.exceptions.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductService extends AbstractService<Product, Long> {
	
	private final ProductRepository repository;
	
	@Override
	protected JpaRepository<Product, Long> getRepository() {
		return this.repository;
	}
	
	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Product findById(Long id){
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Produto não encontrado"));
	}
	
	@Override
	public Product insert(Product product) {
		if (this.repository.existsByNameIgnoreCase(product.getName())){
			throw new ObjectAlreadyExistsException("Já existe um produto com este nome.");
		}
		product.setDataCriacao(new Date());
		return this.repository.save(product);
	}
	
	@Override
	public Product update(Product product) {
		if (this.repository.existsByIdNotAndNameIgnoreCase(product.getId(), product.getName())) {
			throw new ObjectAlreadyExistsException("Já existe um produto com este nome.");
		}
		product.setDataAlteracao(new Date());
		return this.repository.save(product);
	}

}

package com.capgemini.start.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.start.domain.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	boolean existsByDescricaoIgnoreCase(String descricao);
	
	boolean existsByIdNotAndNameIgnoreCase(Long id, String name);

}

package com.capgemini.start.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.start.domain.entity.Client;





@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	
	boolean existsByEmailIgnoreCase(String email);
	
	boolean existsByIdNotAndEmailIgnoreCase(Long id, String email);

}

package com.capgemini.start.domain.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capgemini.start.domain.entity.Client;
import com.capgemini.start.domain.repository.ClientRepository;
import com.capgemini.start.domain.service.exceptions.ObjectAlreadyExistsException;
import com.capgemini.start.domain.service.exceptions.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ClientService extends AbstractService<Client, Long> {
	
	private final ClientRepository repository;
	
	@Override
	protected JpaRepository<Client, Long> getRepository() {
		return this.repository;
	}
	
	@Override
	public List<Client> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Client findById(Long id){
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado"));
	}
	
	@Override
	public Client insert(Client Client) {
		if (this.repository.existsByEmailIgnoreCase(Client.getEmail())){
			throw new ObjectAlreadyExistsException("Já existe um cliente com este e-mail.");
		}
		Client.setDataCriacao(new Date());
		return this.repository.save(Client);
	}
	
	@Override
	public Client update(Client Client) {
		if (this.repository.existsByIdNotAndEmailIgnoreCase(Client.getId(), Client.getEmail())) {
			throw new ObjectAlreadyExistsException("Já existe outro cliente com este e-mail ou cpf.");
		}
		Client.setDataCriacao(new Date());
		return this.repository.save(Client);
	}

}

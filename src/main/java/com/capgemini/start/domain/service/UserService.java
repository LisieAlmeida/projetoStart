package com.capgemini.start.domain.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capgemini.start.domain.entity.User;
import com.capgemini.start.domain.repository.UserRepository;
import com.capgemini.start.domain.service.exceptions.ObjectAlreadyExistsException;
import com.capgemini.start.domain.service.exceptions.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService extends AbstractService<User, Long> {
	
	private final UserRepository repository;
	
	@Override
	protected JpaRepository<User, Long> getRepository() {
		return this.repository;
	}
	
	@Override
	public List<User> findAll() {
		return repository.findAll();
	}
	
	@Override
	public User findById(Long id){
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));
	}
	
	@Override
	public User insert(User user) {
		if (this.repository.existsByEmailIgnoreCase(user.getEmail())){
			throw new ObjectAlreadyExistsException("Já existe um usuário com este e-mail.");
		}
		user.setDataCriacao(new Date());
		return this.repository.save(user);
	}
	
	@Override
	public User update(User user) {
		if (this.repository.existsByIdNotAndEmailIgnoreCase(user.getId(), user.getEmail())) {
			throw new ObjectAlreadyExistsException("Já existe outro usuário com este e-mail.");
		}
		user.setDataCriacao(new Date());
		return this.repository.save(user);
	}

}

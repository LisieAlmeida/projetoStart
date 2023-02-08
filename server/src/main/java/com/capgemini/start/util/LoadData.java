package com.capgemini.start.util;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.start.domain.entity.User;
import com.capgemini.start.domain.repository.UserRepository;



@Component
public class LoadData {
	@Autowired
	private UserRepository userRepository;
	
	private void LoadUsers() {
		var maria = new User(null, "Maria", "maria@maria.com", "123456", new Date(), null);
		var joao = new User(null, "João", "joao@joao.com", "456789", new Date(), null);
		userRepository.saveAll(List.of(maria, joao));
	}
	
	@PostConstruct
	public void Load() {
		LoadUsers();
	}
}


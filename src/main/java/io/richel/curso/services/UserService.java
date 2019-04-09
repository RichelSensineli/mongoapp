package io.richel.curso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.richel.curso.domain.User;
import io.richel.curso.repositories.UserRepository;
import io.richel.curso.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado!"));
	}
}

package io.richel.curso.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.richel.curso.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}

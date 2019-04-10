package io.richel.curso.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.richel.curso.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}

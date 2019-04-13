package io.richel.curso.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.richel.curso.domain.Post;
import io.richel.curso.repositories.PostRepository;
import io.richel.curso.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Post não encontrado!"));
	}
	
	public List<Post> findByTitle(String text){
		return repository.searchTitle(text);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate){
		
		maxDate = new Date(maxDate.getTime() + 24 *60 *60 * 1000);
		return repository.fullSearch(text, minDate, maxDate);
	}
	
	
}

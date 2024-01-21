package com.jpa.prac.controller;

import java.util.Optional;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.prac.model.Author;
import com.jpa.prac.repositories.AuthorRepository;

@RestController
@RequestMapping(path="/api/v1")
public class AuthorController {
	
	
	
	private AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	@GetMapping(path="/{id}")
	public Author getAuthor(@PathVariable("id") Long id) {
		
		Optional<Author> author = authorRepository.findById(id);
		
		if(!author.isPresent()) {
			throw new NoResultException();
		}else {
			return author.get();
		}
	}
	
	@PostMapping
	public Author persistAuthor(Author author) {
		Author  a = authorRepository.save(author);
		
		return a;
	}
	
}

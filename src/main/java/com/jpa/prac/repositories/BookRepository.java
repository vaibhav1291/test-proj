package com.jpa.prac.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.prac.model.Author;
import com.jpa.prac.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	
	

}

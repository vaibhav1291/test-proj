package com.jpa.prac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jpa.prac.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

	

}

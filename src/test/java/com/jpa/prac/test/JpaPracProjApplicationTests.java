package com.jpa.prac.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.prac.controller.AuthorController;
import com.jpa.prac.model.Author;

@SpringBootTest
class JpaPracProjApplicationTests {
	
	@Autowired
	AuthorController authorController;
	
	

	@Test
	void contextLoads() {
		
		
		Author author = new Author();
		author.setFirstName("jd");
		author.setLastName("patil");
		
		Author persistAuthor = authorController.persistAuthor(author);
		
		persistAuthor.setFirstName("josh");
		
		//authorController.persistAuthor(author);
		
		
		//authorController.getAuthor(author.getId());
	}

}

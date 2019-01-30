package com.librmanagmentmain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.librarymanagment.Book;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("libDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Book book = new Book();
		
		book.setName("Lord of the rings");
		book.setAuthor("J.R.R.Tolkien");
		book.setLanguage("English");
		book.setQuantity(3);
	
		
		
				
		
		entityManager.getTransaction().begin();
		entityManager.persist(book);
		entityManager.getTransaction().commit();
		
		
		entityManager.close();
		entityManagerFactory.close();

	}

}

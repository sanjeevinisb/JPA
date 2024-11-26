package com.xworkz.books.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.books.dto.BooksEntity;

public class BooksRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("com");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction eT = entityManager.getTransaction();

		try {
			eT.begin();
			BooksEntity book = new BooksEntity();
			book.setId(5);
			book.setTitle("Malgudi Days");
			book.setAuthor("R. K. Narayan");
			book.setGenre("Fiction");
			book.setPublishedYear(1943);
			book.setPages(264);
			book.setPublisher("Indian Thought Publications");
			book.setLanguage("English");
			book.setIsbn("978-8185986075");
			book.setPrice(7.99);
			entityManager.persist(book);
			eT.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			eMF.close();
		}
	}

}

package com.xworkz.books.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.books.dto.NovelEntity;

public class NovelRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("com");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction eT = entityManager.getTransaction();
		try {
			eT.begin();
			NovelEntity novel = new NovelEntity();
			novel.setId(1);
			novel.setTitle("The White Tiger");
			novel.setAuthor("Aravind Adiga");
			novel.setGenre("Fiction");
			novel.setPublishedYear(2008);
			novel.setPages(320);
			novel.setPublisher("HarperCollins");
			novel.setLanguage("English");
			novel.setIsbn("978-0-06-153793-3");
			novel.setPrice(10.99);
			entityManager.merge(novel);
			eT.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			eMF.close();
		}
	}

}

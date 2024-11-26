package com.xworkz.sarees.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.sarees.dto.SareesEntity;

public class DrapesRunner {
	 public static void main(String[] args) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();

	        try {
	            et.begin();
	            Integer id =11;
	            SareesEntity saree = new SareesEntity();
	            SareesEntity value =em.find(SareesEntity.class, id);
	            em.remove(value);
	            et.commit();
	        } catch (Exception e) {
e.printStackTrace();
} finally {
	em.close();
	emf.close();
}
	 }
}

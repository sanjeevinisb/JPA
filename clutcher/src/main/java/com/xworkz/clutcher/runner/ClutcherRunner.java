package com.xworkz.clutcher.runner;

import javax.persistence.EntityManager;  
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.clutcher.dto.ClutcherEntity;

public class ClutcherRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("com");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction eT = entityManager.getTransaction();

		try {
			eT.begin();
			ClutcherEntity clutcher = new ClutcherEntity();
			clutcher.setId(10);
			clutcher.setName("Mini Claw Clips");
			clutcher.setPrice(180.0);
			clutcher.setQuantity(3);
			clutcher.setColor("Silver");
			clutcher.setMaterial("Metal");
			clutcher.setCreated_at(80654321L);
			clutcher.setUpdated_at(16754448L);
			clutcher.setIs_available("True");
			entityManager.persist(clutcher);
			eT.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			eMF.close();
		}
	}

}

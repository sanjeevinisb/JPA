package com.xworkz.lens.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.lens.dto.LensEntity;

public class LensRunner {

	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("com");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction eT = entityManager.getTransaction();

		try {
			eT.begin();
			LensEntity lens = new LensEntity();
			lens.setId(5);
			lens.setBrand("Tamron");
			lens.setModel("SP 70-200mm");
			lens.setFocal_Length(70);
			lens.setAperture(2.8f);
			lens.setWeight(1500.0f);
			lens.setPrice(1299.00);
			lens.setMaterial("Metal");
			lens.setColor("Black");
			lens.setIs_Waterproof("true");
			entityManager.persist(lens);
			eT.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			eMF.close();
		}
	}

}

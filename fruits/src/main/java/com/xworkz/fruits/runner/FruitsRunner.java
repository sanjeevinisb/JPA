package com.xworkz.fruits.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.fruits.dto.FruitsEntity;

public class FruitsRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("com");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction eT = entityManager.getTransaction();

		try {
			eT.begin();
			// First Fruit
			FruitsEntity fruit1 = new FruitsEntity();
			fruit1.setId(1);
			fruit1.setName("Apple");
			fruit1.setColor("Red");
			fruit1.setWeight(150.0f);
			fruit1.setPrice(1.20);
			fruit1.setOrigin("USA");
			fruit1.setSeason("Fall");
			fruit1.setTaste("Sweet");
			fruit1.setIs_Organic("true");
			fruit1.setShelf_Life(30);
			entityManager.persist(fruit1);
			eT.commit();
			// second Fruit
			FruitsEntity fruit2 = new FruitsEntity();
			fruit2.setId(2);
			fruit2.setName("Banana");
			fruit2.setColor("Yellow");
			fruit2.setWeight(120.0f);
			fruit2.setPrice(0.50);
			fruit2.setOrigin("Ecuador");
			fruit2.setSeason("All year");
			fruit2.setTaste("Sweet");
			fruit2.setIs_Organic("true");
			fruit2.setShelf_Life(7);
			entityManager.persist(fruit2);
			eT.commit();
			// Third Fruit
			FruitsEntity fruit3 = new FruitsEntity();
			fruit3.setId(3);
			fruit3.setName("Orange");
			fruit3.setColor("Orange");
			fruit3.setWeight(200.0f);
			fruit3.setPrice(0.80);
			fruit3.setOrigin("Spain");
			fruit3.setSeason("Winter");
			fruit3.setTaste("Citrus");
			fruit3.setIs_Organic("false");
			fruit3.setShelf_Life(20);
			entityManager.persist(fruit3);
			eT.commit();
			// Fourth Fruit
			FruitsEntity fruit4 = new FruitsEntity();
			fruit4.setId(4);
			fruit4.setName("Strawberry");
			fruit4.setColor("Red");
			fruit4.setWeight(15.0f);
			fruit4.setPrice(2.50);
			fruit4.setOrigin("Mexico");
			fruit4.setSeason("Spring");
			fruit4.setTaste("Sweet");
			fruit4.setIs_Organic("true");
			fruit4.setShelf_Life(5);
			entityManager.persist(fruit4);
			eT.commit();
			// Fifth Fruit
			FruitsEntity fruit5 = new FruitsEntity();
			fruit5.setId(5);
			fruit5.setName("Grapes");
			fruit5.setColor("Green");
			fruit5.setWeight(5.0f);
			fruit5.setPrice(2.00);
			fruit5.setOrigin("Italy");
			fruit5.setSeason("Summer");
			fruit5.setTaste("Sweet");
			fruit5.setIs_Organic("false");
			fruit5.setShelf_Life(10);
			entityManager.persist(fruit5);
			eT.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			eMF.close();
		}
	}

}

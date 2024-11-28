package com.xworkz.login.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.login.dto.LoginDTO;

public class LoginGetAll {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<LoginDTO> list = em.createQuery("select l from LoginDTO l", LoginDTO.class).getResultList();
		for (LoginDTO loginDTO : list) {
			System.out.println("login list ===" + loginDTO.getId() + "===" + loginDTO.getName() + "==="
					+ loginDTO.getEmail() + "===" + loginDTO.getPassword() + "===" + loginDTO.getAddress() + "==="
					+ loginDTO.getPhoneNumber()+"==="+loginDTO.getAge());

		}

		try {
			et.begin();

			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
			em.close();
			emf.close();
		}
	}
}

package com.xworkz.country.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.country.dto.StateDTO;

public class CountryRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        Integer id = 1;
        Integer id1 =2;
        Integer id2 = 3;
        
        StateDTO states = em.find(StateDTO.class, id);
        StateDTO states1 = em.find(StateDTO.class, id1);
        StateDTO states2 = em.find(StateDTO.class, id2);

        
        System.out.println("states==" + states.getOfficialLanguage());
        System.out.println("states==" + states1.getCapital());
        System.out.println("states==" + states2.getStateName());


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


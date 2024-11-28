package com.xworkz.login.runner;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LoginNameAndEmail {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.createQuery("UPDATE LoginDTO l SET l.name = :newName, l.email = :newEmail WHERE l.phoneNumber = '7795672341'")
              .setParameter("newName", "Krishav")
              .setParameter("newEmail", "krishav@gmail.com")
              .executeUpdate();
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

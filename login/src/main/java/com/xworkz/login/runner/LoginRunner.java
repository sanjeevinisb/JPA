package com.xworkz.login.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.login.dto.LoginDTO;

public class LoginRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        List<LoginDTO> logins = new ArrayList<>();

        logins.add(new LoginDTO("Sanjeevini", "sanju@gmail.com", "sanjeevini@123", "7795876788", "Dharwad", 25));
        logins.add(new LoginDTO("Sneha", "sneha@gmail.com", "sneha@123", "8088563251", "Bagalkot", 28));
        logins.add(new LoginDTO("Nikhita", "nikhita@gmail.com", "nikhita@123", "7798654321", "Hubballi", 22));
        logins.add(new LoginDTO("Bharati", "bharati@gmail.com", "bharati@123", "9908765434", "Haveri", 30));
        logins.add(new LoginDTO("Aarati", "aarati@gmail.com", "aarat@123", "8088963214", "Gadag", 27));
        logins.add(new LoginDTO("Sindhu", "sindhu@gmail.com", "sindhu@123", "9456337821", "Karwar", 24));
        logins.add(new LoginDTO("Niharika", "niha@gmail.com", "niha@123", "9902454621", "Davangere", 26));
        logins.add(new LoginDTO("Kanika", "kanika@gmail.com", "kanika@123", "7795672341", "Mandya", 29));
        logins.add(new LoginDTO("Varsha", "varsha@gmail.com", "varsha@123", "6360218686", "Shimoga", 23));
        logins.add(new LoginDTO("Amrutha", "amrutha@gmail.com", "amrutha@123", "9906787432", "Tumkur", 31));

        try {
            et.begin();
            for (LoginDTO login : logins) {
                em.persist(login);
            }
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

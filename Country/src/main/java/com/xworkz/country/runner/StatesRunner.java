package com.xworkz.country.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.country.dto.StateDTO;

public class StatesRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        List<StateDTO> states = new ArrayList<StateDTO>();
        states.add(new StateDTO("Karnataka", "Bengaluru", 61.1, 191791, 220, 75.4, "Kannada", "Krishna", "Mysore Palace", "Siddaramaiah"));
        states.add(new StateDTO("Maharashtra", "Mumbai", 112.4, 307713, 400, 82.3, "Marathi", "Godavari", "Gateway of India", "Eknath Shinde"));
        states.add(new StateDTO("Uttar Pradesh", "Lucknow", 199.8, 243286, 230, 67.7, "Hindi", "Ganges", "Taj Mahal", "Yogi Adityanath"));
        states.add(new StateDTO("Tamil Nadu", "Chennai", 72.1, 130058, 230, 80.1, "Tamil", "Kaveri", "Marina Beach", "M. K. Stalin"));
        states.add(new StateDTO("Gujarat", "Gandhinagar", 60.4, 196024, 210, 78.0, "Gujarati", "Narmada", "Statue of Unity", "Bhupendra Patel"));
        states.add(new StateDTO("West Bengal", "Kolkata", 91.3, 88752, 150, 77.1, "Bengali", "Hooghly", "Victoria Memorial", "Mamata Banerjee"));
        states.add(new StateDTO("Rajasthan", "Jaipur", 68.5, 342239, 140, 66.1, "Hindi", "Chambal", "Hawa Mahal", "Ashok Gehlot"));
        states.add(new StateDTO("Madhya Pradesh", "Bhopal", 72.6, 308252, 130, 70.6, "Hindi", "Narmada", "Khajuraho Temples", "Shivraj Singh Chouhan"));
        states.add(new StateDTO("Bihar", "Patna", 104.1, 94163, 110, 63.8, "Hindi", "Ganges", "Mahabodhi Temple", "Nitish Kumar"));
        states.add(new StateDTO("Andhra Pradesh", "Amaravati", 49.6, 162968, 120, 67.4, "Telugu", "Godavari", "Tirupati Temple", "Y. S. Jagan Mohan Reddy"));

        try {
            et.begin();
            for (StateDTO stateDTO : states) {
                em.persist(stateDTO);
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

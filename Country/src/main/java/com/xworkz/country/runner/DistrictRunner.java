package com.xworkz.country.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.country.dto.DistrictDTO;

public class DistrictRunner {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        List<DistrictDTO> districts = new ArrayList<DistrictDTO>();

        districts.add(new DistrictDTO("Bengaluru Urban", "Bengaluru", 96.21, 2196, 88.71, "Kannada", "Arkavathi", "Vidhana Soudha", "Manjunath Prasad"));
        districts.add(new DistrictDTO("Mysuru", "Mysuru", 30.01, 6314, 72.56, "Kannada", "Kaveri", "Mysore Palace", "Rohini Sindhuri"));
        districts.add(new DistrictDTO("Dakshina Kannada", "Mangaluru", 20.89, 4866, 88.62, "Kannada", "Netravati", "St. Aloysius Chapel", "Dr. Rajendra K.V."));
        districts.add(new DistrictDTO("Udupi", "Udupi", 11.77, 3880, 86.24, "Kannada", "Swarnamukhi", "Krishna Temple", "G. Jagadeesha"));
        districts.add(new DistrictDTO("Belagavi", "Belagavi", 47.79, 13415, 73.94, "Kannada", "Krishna", "Belgaum Fort", "M.G. Hiremath"));
        districts.add(new DistrictDTO("Dharwad", "Dharwad", 18.47, 4263, 80.3, "Kannada", "Malaprabha", "Unkal Lake", "Nitesh Patil"));
        districts.add(new DistrictDTO("Ballari", "Ballari", 25.35, 8447, 67.85, "Kannada", "Tungabhadra", "Hampi", "Pavan Kumar Malapati"));
        districts.add(new DistrictDTO("Shivamogga", "Shivamogga", 17.52, 8477, 80.5, "Kannada", "Tunga", "Jog Falls", "Selvakumar J."));
        districts.add(new DistrictDTO("Tumakuru", "Tumakuru", 26.78, 10597, 75.14, "Kannada", "Shimsha", "Devarayanadurga", "Y.S. Patil"));
        districts.add(new DistrictDTO("Kalaburagi", "Kalaburagi", 25.64, 10951, 65.65, "Kannada", "Bhima", "Gulbarga Fort", "Vijay Mahantesh Danammanavar"));

        try {
            et.begin();
            for (DistrictDTO district : districts) {
                em.persist(district);
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

package com.jsp.hospital.branch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitalBranches {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sk");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Hospital hospital= new Hospital();
		hospital.setName("XYZ");
		hospital.setEmail("xtz@mail.com");
		hospital.setCno(9876543234l);
		
		Branch branches1= new Branch();
		branches1.setBranch_city("Mumbai");
		
		Branch branches2= new Branch();
		branches2.setBranch_city("Mumbai");
		
		Branch branches3= new Branch();
		branches3.setBranch_city("Mumbai");
		
		Branch branches4= new Branch();
		branches4.setBranch_city("Mumbai");
		
		List<Branch> branches= new ArrayList<Branch>();
		
		branches.add(branches4);
		branches.add(branches3);
		branches.add(branches2);
		branches.add(branches1);
		
		hospital.setBranch(branches);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branches1);
		entityManager.persist(branches2);
		entityManager.persist(branches3);
		entityManager.persist(branches4);
		entityTransaction.commit();
		
	}

}

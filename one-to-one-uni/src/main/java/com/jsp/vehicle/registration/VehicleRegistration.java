package com.jsp.vehicle.registration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VehicleRegistration {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sk");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Vehicle vehicle= new Vehicle();
		vehicle.setBrand("BMW");
		vehicle.setColor("White");
		vehicle.setPrice(4567890);
		
		
		Registration registration= new Registration();
		registration.setCity("Mumbai");
		registration.setRegistration_no("MH01PQ2023");
		vehicle.setRegistration(registration);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(registration);
		entityTransaction.commit();

	}

}

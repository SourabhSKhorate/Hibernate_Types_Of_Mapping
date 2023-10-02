package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonPan {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sk");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Person person= new Person();
		
		person.setName("XYZ");
		person.setEmail("xyz@mail.com");
		person.setCno(877737795l);
		
		Pan pan= new Pan();
		
		pan.setAddress("Mumabai");
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		

	}

}

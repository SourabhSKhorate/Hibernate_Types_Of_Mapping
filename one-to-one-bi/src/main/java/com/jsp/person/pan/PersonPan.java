package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonPan {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sk");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Person person= new Person();
		
		person.setName("sk");
		person.setEmail("xyz@mail.com");
		person.setCno(4567899987l);
		
		Pan pan= new Pan();
		pan.setAddress("Mumbai");
		pan.setPerson(person);
		person.setPan(pan);
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		

	}

}

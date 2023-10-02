package com.jsp.person.account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonAccount {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sk");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Person person= new Person();
		person.setName("XYZ");
		person.setEmail("xyz@mail.com");
		person.setCno(9876543217l);
		
		Account account1 = new Account();
		account1.setBank_name("SBI");
		account1.setAccount_no(456798765);
		account1.setIfsc_code("SBI4567");
		account1.setPerson(person);
		
		Account account2 = new Account();
		account2.setBank_name("HDFC");
		account2.setAccount_no(996733765);
		account2.setIfsc_code("HDFC7890");
		account2.setPerson(person);
		
		Account account3 = new Account();
		account3.setBank_name("PNB");
		account3.setAccount_no(123798765);
		account3.setIfsc_code("PNB1232");
		account3.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(account1);
		entityManager.persist(account2);
		entityManager.persist(account3);		
		entityTransaction.commit();

	}

}

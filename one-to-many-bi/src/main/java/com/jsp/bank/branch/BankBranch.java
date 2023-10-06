package com.jsp.bank.branch;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankBranch {
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sk");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bank bank = new Bank();
		bank.setName("HDFC");
		
		Branch branch1 = new Branch();
		branch1.setName("Kharghar");
		branch1.setBank(bank);
		
		Branch branch2 = new Branch();
		branch2.setName("Vashi");
		branch2.setBank(bank);
		
		Branch branch3 = new Branch();
		branch3.setName("Thane");
		branch3.setBank(bank);
		
		Branch branch4 = new Branch();
		branch4.setName("Belapur");
		branch4.setBank(bank);
		
		ArrayList<Branch> branches = new ArrayList<Branch>();
		branches.add(branch1);
		branches.add(branch2);
		branches.add(branch3);
		branches.add(branch4);

		bank.setBranchs(branches);
		
		entityTransaction.begin();
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityManager.persist(branch4);
		entityManager.persist(bank);
		entityTransaction.commit();
	}

}

package com.jsp.course.student;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CourseStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sk");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student s1 = new Student();
		s1.setMail("abc@mail");
		s1.setName("abc");
	
		Student s2 = new Student();
		s2.setMail("xyz@mail");
		s2.setName("xyz");
		
		Student s3 = new Student();
		s3.setMail("pqr@mail");
		s3.setName("pqr");
		
		Student s4 = new Student();
		s4.setMail("efg@mail");
		s4.setName("efg");
		
		ArrayList<Student> student  = new ArrayList<Student>();
		student.add(s4);
		student.add(s2);
		student.add(s1);
		student.add(s3);
		
		Course c1 =new Course();
		c1.setDuration(1);
		c1.setName("Java");
		c1.setStudent(student);
		
		Course c2 =new Course();
		c2.setDuration(2);
		c2.setName("Sql");
		c2.setStudent(student);
		
		
		Course c3 =new Course();
		c3.setDuration(3);
		c3.setName("WebTech");
		c3.setStudent(student);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(c3);
		courses.add(c2);
		courses.add(c1);
		
		s1.setCourses(courses);
		s2.setCourses(courses);
		s3.setCourses(courses);
		s4.setCourses(courses);
		
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityManager.persist(s4);
//		entityManager.persist(c1);
//		entityManager.persist(c2);
//		entityManager.persist(c3);
		entityTransaction.commit();
		
	
	}

}

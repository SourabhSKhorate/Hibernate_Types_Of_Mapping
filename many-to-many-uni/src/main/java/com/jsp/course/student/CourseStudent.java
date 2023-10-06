package com.jsp.course.student;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CourseStudent {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sk");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = new Student();
		student.setName("ABC");
		student.setMail("abc@mail.com");

		Course course1 = new Course();
		course1.setCoursename("Java");
		course1.setDuration("2months");

		Course course2 = new Course();
		course2.setCoursename("Web Technologies");
		course2.setDuration("1months");

		Course course3 = new Course();
		course3.setCoursename("Advanced Java");
		course3.setDuration("2months");

		List<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);

		student.setCourses(courses);

		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();
	}

}

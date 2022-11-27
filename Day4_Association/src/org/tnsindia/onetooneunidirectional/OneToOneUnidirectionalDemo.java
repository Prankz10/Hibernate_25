package org.tnsindia.onetooneunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//student1 created
		Student s=new Student();
		s.setID(1001);
		s.setNAME("Pranit");
		
		//student2 created
		Student s1=new Student();
		s1.setID(1002);
		s1.setNAME("Mohan");
		
		//address1 created
		Address a=new Address();
		a.setStreetNo(101);
		a.setArea("Bhandup");
		a.setCity("Mumbai");
		
		//address2 created
		Address a1=new Address();
		a1.setStreetNo(115);
		a1.setArea("Mulund");
		a1.setCity("Mumbai");
		
		//inject address into student1
		s.setAddress(a);
		em.persist(s);
		
		//inject address into student2
		s1.setAddress(a1);
		em.persist(s1);
		
		em.getTransaction().commit();
		System.out.println("Your data is added");
		em.close();
		f.close();
	}
}
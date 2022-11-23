package org.tnsindia.joinedinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//driver class
public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//create a sales
		Sales s=new Sales();
		s.setSales_id(10);
		s.setPrice(5550.60);
		em.persist(s);
		
		Sales s1=new Sales();
		s1.setSales_id(11);
		s1.setPrice(2000.60);
		em.persist(s1);
		
		//create a deptartment
		
		SalesDepartment d=new SalesDepartment();
		d.setSales_id(12);
		d.setPrice(6650.50);
		d.setDept_id(123);
		d.setDept_name("Cosmetics");
		em.persist(d);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
	
	}

}
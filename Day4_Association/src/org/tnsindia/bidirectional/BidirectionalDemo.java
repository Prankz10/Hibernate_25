package org.tnsindia.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//create a dept1;
		
		Department department=new Department();
		department.setId(12121);
		department.setName("HR");
		
		//create a dept2;
		
		Department department1=new Department();
		department1.setId(13131);
		department1.setName("Marketing");
		
		//create an emp1;
		Employee emp=new Employee();
		emp.setEmp_id(163);
		emp.setEmp_name("Pranit Jadhav");
		emp.setSalary(50000);
		
		//create an emp1;
		Employee emp1=new Employee();
		emp1.setEmp_id(193);
		emp1.setEmp_name("Praneet");
		emp1.setSalary(35000);
		
		emp.setDepartment(department);
		em.persist(emp);
		
		
		emp1.setDepartment(department1);
		em.persist(emp1);
		
		em.getTransaction().commit();
		System.out.println("Your data is added");
		em.close();
		f.close();					

	}
}
package com.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.model.Employee;
import com.training.util.HibernateUtil;

public class TestEmployee {

	public static void main(String[] args) {

		/*Employee alex = new Employee(101, "Alex Browning", "HR", 23000);
		Employee anna = new Employee(102, "Anna Parker", "SALES", 34000);
		Employee james = new Employee(103, "James P", "ADMIN", 12000);

		saveEmployee(alex);
		saveEmployee(anna);
		saveEmployee(james);*/
		
		/*Employee employee = getEmployee(101);
		System.out.println(employee);*/
		
		
		/*Session session = HibernateUtil.getSession();
		Employee employee = session.load(Employee.class, 110);
        System.out.println("No database hit");
        
        System.out.println(employee);*/
		
		// deleteEmployee(102);
		
		// Updating Employee
		
		/*Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();*/
		
		/*Employee employee = session.get(Employee.class, 103);
		
		employee.setSalary(34000);
		employee.setName("James Parker");*/
		
		/*Employee employee = new Employee(103, "James P", "ADMIN", 50000);
		session.update(employee);*/
		
		// session.saveOrUpdate(employee);
		
		/*tx.commit();	
		session.close();*/
		HibernateUtil.closeSessionFactory();
	}
	
	public static void deleteEmployee(int id) {
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setId(id);
		// Employee employee = session.get(Employee.class, 101);
		
		session.delete(employee);
		tx.commit();
		session.close();
	}
	
	public static Employee getEmployee(int id) {
		
		Session session = HibernateUtil.getSession();
		
		Employee employee = session.get(Employee.class, id);
//		Employee employee = session.load(Employee.class, id);  // It will not work at all.
		
		session.close();
		return employee;
	}

	public static void saveEmployee(Employee employee) {

		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		session.persist(employee);
		// int id = (Integer) session.save(employee);
		// System.out.println("Id => " + id);

		tx.commit();
		session.close();

	}
}

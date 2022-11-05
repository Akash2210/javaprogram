package com.hibarnate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
//main class App
public class App {
	//main method
	public static void main(String[] args) {

		// getting a connection from HibernateUtil class by a getSession() method
		Session session = hibernateUtil.getSession();

		//Creating Employee class object and setting values througn setter() method
		Employee e1 = new Employee();
		e1.setName("Akash");
		e1.setDepartment("IT");
		e1.setSalary(25000);

		Employee e2 = new Employee();
		e2.setName("Surender");
		e2.setDepartment("Electronics");
		e2.setSalary(40000);

		Employee e3 = new Employee();
		e3.setName("Prince");
		e3.setDepartment("Civil");
		e3.setSalary(20000);

		//creating object of Emp_Details and assigning value through setter() method
		Emp_Details ed1 = new Emp_Details();
		ed1.setEd_id(1);
		ed1.setGender("male");
		ed1.setBank_account("PNB");
		ed1.setAddress("Gurugam");
		ed1.setEmp(e1);

		Emp_Details ed2 = new Emp_Details();
		ed2.setEd_id(2);
		ed2.setGender("male");
		ed2.setBank_account("AXIS");
		ed2.setAddress("Delhi");
		ed2.setEmp(e2);

		Emp_Details ed3 = new Emp_Details();
		ed3.setEd_id(3);
		ed3.setGender("male");
		ed3.setBank_account("Indusland");
		ed3.setAddress("Palwal");
		ed3.setEmp(e3);

		Transaction t = session.beginTransaction();
		session.save(ed1);
		session.save(ed2);
		session.save(ed3);
		t.commit();

		Query query = session.createQuery("From Emp_Details");
		List<Emp_Details> ll = query.getResultList();
		for (Emp_Details s : ll) {
			System.out.println(s);
		}
		session.close();
	}

}
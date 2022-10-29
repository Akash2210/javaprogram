/*
 *  Author Name : Akash 

/*
/*
 	StudentDao

    insertStudent(Student st);
    Student getStudent(int id);
    boolean deleteStudent(int id);
    boolean updateStudent(int id);

 */

package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class StudentDAO {
	
	public static boolean insertStudent(Student st) {


		try {
			Session session = HibernateUtil.getSession();
			Transaction t = session.beginTransaction();
			session.save(st);
			t.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}

	public static boolean updateStudent(Student st4) {
		
		try
		{
			Session session=HibernateUtil.getSession();
			Transaction t=session.beginTransaction();
			session.update(st4);

			t.commit();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}


public static boolean deleteStudent(Student st3,int id)
{
	try
	{
		Session session=HibernateUtil.getSession();
		session.beginTransaction();
		Student st=session.get(Student.class,id);
		session.delete(st);
		session.getTransaction().commit();
		return true;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return false;
}
public static Student getStudent(int id) {


	try {
		Session session = HibernateUtil.getSession();
		Transaction t = session.beginTransaction();
		Student st = session.get(Student.class, id);
		session.getTransaction().commit();
		return st;
	} catch (Exception e) {
		System.out.println(e);
	}
	return null;
	}


}
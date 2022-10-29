/*
 *  Author Name : Akash 

/*
/*
  App 

  Menu---1. Add Student   
         2. See Student detail  
         3. Delete a student
         4. Update student details
         9. Exit

 */

package com.hibernate;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{

	public static void main(String[] args) {
		boolean b1 = true;
		while (b1) {
			System.out.println("press 1 to Insert Student");
			System.out.println("press 2 to See Student details");
			System.out.println("press 3 to Delete Student details");
			System.out.println("press 4 to Update ");
			System.out.println("press 9 to Exit ");

			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			boolean b;

			switch (i) {
			case 1: {
				Student st = new Student();
				
				System.out.println("Enter student name : ");
				String sname = sc.next();
				st.setSname(sname);
				System.out.println("Enter student contact : ");
				String contact = sc.next();
				st.setContact(contact);

				b = StudentDAO.insertStudent(st);
				if (b) {
					System.out.println(" INSERTED SUCCESSFULLY \n");
				} else {
					System.out.println(" SOMETHING WENT WRONG \n");
				}
				break;
			}
			case 2: {
				Student stu2 = new Student();
			
				System.out.println("Enter student id to see Details : ");
				int id = sc.nextInt();
				Student s = StudentDAO.getStudent(id);
				System.out.println(s);
				break;
			}
			case 3: {
				Student stu3 = new Student();
				
				System.out.println("Enter student id which you want to delete : ");
				int id = sc.nextInt();
				b = StudentDAO.deleteStudent(stu3, id);
				if (b) {
					System.out.println("DELETE SUCCESSFULLY...");
				} else {
					System.out.println(" SOMETHING WENT WRONG \n");
				}
				break;
			}
			case 4: {
				Student st4=new Student();//
				
				System.out.println("Enter Student id : ");
				int id = sc.nextInt();
				System.out.println(" New Name: ");
				String nName = sc.next();
				System.out.println(" New contact : ");
				String nContact = sc.next();
				st4.setSt_id(id);
				st4.setSname(nName);
				st4.setContact(nContact);
				b = StudentDAO.updateStudent(st4);

				if (b) {
					System.out.println("UPDATE SUCCESSFULLY   ");
				} else {
					System.out.println("SOMETHING WENT WRONG  ");
				}
				break;
			}
			case 9: {
				System.out.println("........Exit....... \n");
				b1 = false;
				break;
			}
			default:
				System.out.println(".....Invalid number....!!");

			}
		}
	}

}

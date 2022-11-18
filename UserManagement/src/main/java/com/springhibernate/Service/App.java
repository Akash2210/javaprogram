package com.springhibernate.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springhibernate.Entity.User;
import com.springhibernate.UserDao.UserDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao udao = (UserDao) ac.getBean("ursdao");
		char a='s';
        while (a=='s')
		 {
			System.out.println("press 1 to insert the user detail: ");
			System.out.println("press 2 to update the user details: ");
			System.out.println("press 3 to delete the user details: ");
			System.out.println("press 4  to see specific user details: ");
			System.out.println("press  5to display the user details: ");
			System.out.println("press  6th to exit:");	
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose any options which you like :\n");
			int i = sc.nextInt();//take value
			//switch cases
			switch (i) {
			//case 1 : for inserting user details
			case 1: {
				User u = new User();
				System.out.println("insert User id:");
				int u1 = sc.nextInt();
				u.setU_Id(u1);
				System.out.println("insert User name:");
				String us2 = sc.next();
				u.setU_Name(us2);
				System.out.println("insert User password:");
				String us3 = sc.next();
				u.setU_Password(us3);
				System.out.println("insert User date of birth:");
				String us4 = sc.next();
				u.setU_dob(us4);
				int i1 = udao.insertUser(u);
				if (i1 == 1)
					System.out.println(" Successfully insert user deatai...");
				else
					System.out.println("Not insert user deatai Successfully...");
				break;
			}
			//case 2: for updating user details
			case 2: {
				User u1 = new User();
				System.out.println("enter id for update the deatail of user...");
				int us1 = sc.nextInt();
				u1.setU_Id(us1);
				System.out.println("enter user new name to update...");
				String us2 = sc.next();
				u1.setU_Name(us2);
				System.out.println("enter user new password to update...");
				String us3 = sc.next();
				u1.setU_Password(us3);
				u1.setU_dob(us3);
				System.out.println("enter user new dob to update...");
		    	String us4 = sc.next();
				int i2 = udao.updateUser(u1);
				if (i2 == 1)
					System.out.println("user details inserted successfully...");
				else
					System.out.println("problem occured during inserting user details...");
				break;
			}
			//case 3: for deleting user details
			case 3: {
				User u2 = new User();
				System.out.println("enter the user id  which you want to delete :");
				int us1 = sc.nextInt();
				u2.setU_Id(us1);
				int i3 = udao.deleteUser(u2);
				if (i3 == 1)
					System.out.println("user details deleted successfully...");
				else
					System.out.println("problem occured during deleting user details...");
				break;

			}
			//case 4: for retrieving specific user details
			case 4: {
				System.out.println("enter uid to get specific user detail: ");
				int uid=sc.nextInt();
				User ug=udao.getUser(uid);
				System.out.println("The details of the user is : ");
				System.out.println(ug);
				break;
			}
			//case 5: for displaying all user details
			case 5: {
				User u3 = new User();
				System.out.println("displaying all users details...");

				List<User> list = udao.getAllUsers();
				System.out.println("\n" + list + "\n");
				break;
			}
			//case 6 for creating a door to exit 
			case 6:{
				System.out.println("Thanks for using User Management System!!");
				a='n';
				break;
			}
		default:
		{
			System.out.println("please choose a valid option.....");
			
		}
		}
   }}}

	
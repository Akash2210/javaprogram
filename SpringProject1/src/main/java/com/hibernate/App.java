/*
 * @ author akash
 *project name=SpringProject1

1.Create a class Book---bid,bname,price
  create 4 beans of Book in xml file.(use constructor or setter injection)

2.Create a class Address---hno,area,city
   create 2 beans of Address in xml file.(use constructor or setter injection)


2.create a class Student---sid,sname,List<Book> blist,Address address

    create 2 beans of Student in xml file and each student has at least 2 books.
   (use constructor or setter injection)

 */



package com.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ac=new ClassPathXmlApplicationContext("com/hibernate/applicationcontext.xml");
       
        Student sts1=(Student)ac.getBean("Studentbean1");
        Student sts2=(Student)ac.getBean("Studentbean2");
        System.out.println(sts1);
        System.out.println(sts2);     
    }
}

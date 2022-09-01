/*Write a program to count number of char in a string entered by user excluding space.*/
/*@ Akash*/
import java.util.Scanner;

public class string1 {
	void display()//Create method 
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String sc=s.nextLine();
		 for(int i = 0; i < sc.length(); i++) 
		 {
			 if(sc.charAt(i) != ' ')//ignore Space
				 
			 {
				 count++; 
			 }
		 }
		   //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count); 
		
	}
	
	 public static void main(String[] args) {    
	      string1 obj=new string1();//create object of a class
	      obj.display();//calling method
	 }
	}



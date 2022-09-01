/* Write a method th find factorial of a number input by user.
factorial(int n).call this methos from main() and pass argument n .
Repeat this untill user enters no.*/
/*
 * @akash*/
 import java.util.Scanner;

public class Factorial {
	public static void main(String []args)
    {
       //Take input from the user
       //Create an instance of the Scanner Class
       Scanner sc=new Scanner(System.in);
       //Declare and Initialize the variable
       System.out.println("Enter the number: ");
       int num=sc.nextInt();
       int i=1,fact=1;
       do
       {
    	   fact=fact*i;
           i++;  
       }
       while(i<=num);
       
       System.out.println("Factorial of the number: "+fact);  
    }   

}

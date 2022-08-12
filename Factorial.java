// author akash
//Write a program to find factorial of a number.

public class Factorial {

		 public static void main(String[] args) {

		  int number = 6;//It is the number to calculate factorial  
		  int factorial = number;

		  for (int i = (number - 1); i > 1; i--) {
		   factorial = factorial * i;
		  }

		  System.out.println("Factorial of " + number + " is " + factorial);
		 }
		}

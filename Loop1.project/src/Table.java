/*Write a program to print table of any number input by user.*/
/*@akash*/
	import java.util.Scanner;
	
	public class Table {
		void display()// create method
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			int n=sc.nextInt();
			for(int i=0;i<10;i++)
				System.out.println(n+"*"+(i+1)+"="+(n*(i+1)));
		}

		
		public static void main(String[]args)
		{
			Table obj=new Table();//create object of a class
			obj.display();//calling method
		}

	}



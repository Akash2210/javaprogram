//You are given a piece of Java code. You have to complete the code by writing down the handlers for exceptions thrown by the code. 
//The exceptions the code may throw along with the handler message are listed below:
//Division by zero: Print "Invalid division".
//String parsed to a numeric variable : Print "Format mismatch".
//Exceptions other than mentioned above : Any other exception except the above ones fall in this category.
// Print "Exception encountered".
//Finally, after the exception is handled, print "Exception Handling Completed".

/*@AkashSingh */
import java.util.Scanner;
import java.lang.Exception;
public class ExceptionTest1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two no");
		String str1=sc.nextLine();
		String str2=sc.nextLine();

		try
		{
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int c=a/b;
		System.out.println("value of divide by a&b:"+c);
			
	}
		catch(NumberFormatException ex)
		{
			System.out.println("format mismatch ");
		}
		catch(Exception e)
		{
			System.out.println("divide by zero is invalid division"+e);
		}
		
		finally
		{
			System.out.println("Exception encountered");
		}
		System.out.println("Exception Handling Completed");
		
		

	}}

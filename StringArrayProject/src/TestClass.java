/*Write a method that takes a String and returns a String of thesame length containing the 'X' character in all positions except thelast 4 positions. 
 * The characters in the last 4 positions must be the same as in the original string. For example, if the argument is"12345678", 
 * the return value should be "XXXX5678".
 * @Akash
 * */

	import java.util.Scanner;
	 
	public class TestClass {
		String display() //method
		{
			
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the string ");
		  String inputString = sc.nextLine();
		  if (inputString.length() > 4) {
	            String ExceptLast4 = inputString.substring(0, inputString.length()-4);
	            String repeatString = "X".repeat(ExceptLast4.length());
	            repeatString +=  inputString.substring(inputString.length()-4);
	            System.out.println(repeatString);
	        }
	        else {
	            System.out.println("Entered string must be greater than 4.");
	        }
		  sc.close();
		  return toString();
	         
	    }
	 
	    public static void main(String[] args)  {
	    	// create object of TestClass
	    	TestClass obj=new TestClass();
	    	obj.display();//method is calling
	    	
	 
	       
	         
	    }
	 
	}

	
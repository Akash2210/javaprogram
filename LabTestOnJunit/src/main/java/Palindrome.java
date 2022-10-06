/*author @Akash*/
/*
 Write a program for to check a palindrome string.
Write test cases for 4 different parameters (use @parametrizedTest annotaion).
*/
public class Palindrome {

	//method checking whether a string is palindrome or not
	public static boolean isPalindrome(String str)
	{
		String rev="";
		//for loop for reversing the string
	for(int i=str.length()-1;i>=0;i--)
		{
		 rev=rev+str.charAt(i);
		}
	//checking whether a string is palindrome or not
		if(str.equals(rev))
			return true;
		else 
			return false;
	}
}
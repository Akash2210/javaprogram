/* Author @Akash*/
/*
 LongestWord.java
    Write a Java program to find the longest word in a text file.
 */

package AkashSingh;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class LongestWord {
	public static void main(String[] args)
	{
		LenthWord();
	}

	
	public static void LenthWord()
	{
		File f=new File("C:\\Users\\admin\\Desktop\\javaprogram\\akash1.txt");
		try {
			String str="";
			String ct;
			
			Scanner sc=new Scanner(f);
			while(sc.hasNext())
			{
				ct=sc.next();
				if(ct.length()>str.length())
				{
					str=ct;
				}
			}
			System.out.println(str);
		}
		catch (FileNotFoundException e) 
		{
				e.printStackTrace();
		}
	}
}



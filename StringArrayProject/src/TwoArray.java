/*Create two arrays. One containing String values: Peter , Amy, John ,Boyd, and
Cathy, and another one containing int values: 15,9, 14, 10,and 12.
 create an  table showing  these values as name value pairs as below.

Name           Value

Amy		9
Boyd		10
Cathy		12
John		14
Peter		15  */
/* @ Akash Singh */


import java.util.Arrays;

public class TwoArray {
	public static void main (String args[])
	
	{
		String[]str= {"Amy","Boyd","Catchy","John","Peter"};
		int[] arr= {9,10,12,14,15};
		
				//print string and number
		for(int i=0;i<arr.length||i< str.length;i++)
		System.out.println(str[i]+"      "+arr[i]);
			
		
	}

}

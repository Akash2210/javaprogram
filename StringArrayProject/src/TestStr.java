/*Write a method that takes a String[] as an argument and return a String containing the concatenation of all the strings in the
input array. Invoke your method 3 times with different arguments. Make sure that your code handles the cases where the argument is null.
 */
/* @ Akash Singh*/
public class TestStr {
	//accept  String array 
	static String strConcat(String st[])
	{
		StringBuilder builder = new StringBuilder();;
		try {
			if(st==null) {
				throw new Exception();
			}


			for(String s : st) {

				builder.append(s+" ");
			}
		}catch(Exception e)
		{

			System.out.print("Array Cannot Null");
		}

		return builder.toString();
	}
	public static void main(String[] args) {
//		 three array of Strings
		String st1[]= null;
		String st2[]= {"Old","is","Gold"};
		String st3[]= {"Akash","Singh"};

		System.out.println(strConcat(st1));
		System.out.println(strConcat(st2));
		System.out.println(strConcat(st3));

	}

}

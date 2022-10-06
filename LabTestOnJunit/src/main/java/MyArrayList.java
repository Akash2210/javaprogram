/*author @akash*/
/*
 Create an ArrayList.Add few elements.
Write following test cases in a separate java file--
a.)Test for empty list.
b.)Test  for size of arrayList.
 */


import java.util.ArrayList;
public class MyArrayList {
	//method myArrayListMain()
		public static ArrayList<Integer> myArrayListMain() {
			//creating the object al for ArrayList
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
			//returning the values of arraylist
			return al;	
		}

}

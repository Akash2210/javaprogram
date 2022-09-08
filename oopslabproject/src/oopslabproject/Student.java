
/* 2.Create a class  Student with four data members and constructors-
   
Institute name---it should be static and final.
  rollno.
  name
  age

Generate getter /setter and Override toString();
In the main class make 3 objects of Student  ...set their values and and print details.

*/



package oopslabproject;

public class Student {
	//data members
	private String name;
	private int age;
	private int rollno;
	final static String institute="ANUDIP FOUNDATION..";
	//default constructor
	public Student() {
		super();
		this.name = "";
		this.age = 0;
		this.rollno = 0;
	}//Parameter constructor
	public Student(String name, int age, int rollno) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}
	/*Generate getter /setter*/
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/**
	 * @return the institute
	 */
	public static String getInstitute() {
		return institute;
	}
	/* Override toString();*/
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollno=" + rollno + "]";
	}
	
	

	
}

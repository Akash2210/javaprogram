package oopslabproject;

public class StudentMain extends Student {
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setName("Akash Singh");
		s1.setAge(22);
		s1.setRollno(18);
		
		System.out.println(s1.getInstitute());
		System.out.println("Name is - "+s1.getName());
		System.out.println("Age is - "+s1.getAge());
		System.out.println("Roll Number is - "+s1.getRollno());

	}

}



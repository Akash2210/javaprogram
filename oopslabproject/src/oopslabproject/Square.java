package oopslabproject;

public class Square implements Shape
{
	public int length=20;//data member

	@Override
	public int area() {
		// TODO Auto-generated method stub
		int ar=length*length;
		return ar;
	}
	
	
	
}

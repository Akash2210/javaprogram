package oopslabproject;


	public class Rectangle extends Square implements Shape
	{
		public int width=30;//data member
		
		@Override
		public int area()
		{
			int ar=2*length*width;
			return ar;
		}
	}



package oopslabproject;

	public class ShapeMain 
	{
		public static void main(String args[])
		{
			Square sq=new Square();
			sq.area();
			System.out.println("The area of the square is : "+sq.area());
			
			Rectangle re=new Rectangle();
			re.area();
			System.out.println("The area of the rectangle is : "+re.area());
		}
	}



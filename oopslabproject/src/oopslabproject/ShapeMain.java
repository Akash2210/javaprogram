package oopslabproject;

	public class ShapeMain 
	{
		public static void main(String args[])
		{
			Square sq=new Square();//Create object of Square Class
			sq.area();
			System.out.println("The area of the square is : "+sq.area());
			
			Rectangle re=new Rectangle();//Create object of Rectangle Class
			re.area();
			System.out.println("The area of the rectangle is : "+re.area());
		}
	}



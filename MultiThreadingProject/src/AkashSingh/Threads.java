/*@ Akash*/
/*Write a Java program to create multiple thread in Java.
    (Print even and Odd numbers)Set their name and properities.*/


package AkashSingh;
class EvenOddThread
{
	 void runeven()
	{
		 System.out.println(Thread.currentThread().getName()+"The Even numbers are :");
			
			for(int i=0;i<30;i++)
			{	
				//checking condition for Even using if condition
				if(i%2==0)
				{
					System.out.println(Thread.currentThread().getName()+"Even number : "+i);
				}
			}
	}
	 void runodd()
	 {
		 System.out.println(Thread.currentThread().getName()+"The Odd numbers are :");
		 for(int i=0;i<50;i++)
			{	
				//checking condition for odd using if condition
				if(i%2!=0)
				{
					System.out.println(Thread.currentThread().getName()+"Odd number : "+i);
				}
			}

	 }
}
class Even implements Runnable
{
	@Override
	public void run() 
	{
		EvenOddThread e=new EvenOddThread();
				e.runeven();		
	}
}


class Odd implements Runnable
{

	@Override
	public void run() {
		EvenOddThread e=new EvenOddThread();
				e.runodd();
		
	}
	
}


public class Threads {

	public static void main(String[] args) {
		EvenOddThread r=new EvenOddThread();
		Even r1=new Even();
		Odd r2 =new Odd();
		
		
		Thread th1=new Thread(r1,"Thread 1 ");
		Thread th2=new Thread(r2,"Thread 2 ");
		
		th1.start();
		th1.setPriority(1);
		th2.start();
		th2.setPriority(2);
	}

} 
	

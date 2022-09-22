
/*@ Akash*/
/*Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If deamnding number is gretaer than availableProduct
  consumer should wait till supply increases the availableProduct. */
  


package AkashSingh;

class DemandSupply
{
	int availableProduct=10;
	synchronized public void demandMethod(int avail)
	{
		if(availableProduct<avail) 
		{
			try {
				wait(100);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
			availableProduct-=avail;
			System.out.println("Demand product:-"+availableProduct);
		}
	
	synchronized public void supplyMethod(int i)
	{
		availableProduct+=i;
		System.out.println("supply product:-"+availableProduct);

		notify();
	}
}
class MyThread1 extends Thread{
	 DemandSupply ds;
	MyThread1( DemandSupply ds)
	{
		this.ds=ds;
	}
	public void run()
	{
		ds.demandMethod(2);
	}
}class MyThread2 extends Thread{
	 DemandSupply ds;
	MyThread2( DemandSupply ds)
	{
		this.ds=ds;
	}
	public void run()
	{
		ds.supplyMethod(3);
	}
} 
public class Producer {

	public static void main(String[] args) {
		
		 DemandSupply ds=new  DemandSupply();
			MyThread1 th=new MyThread1(ds);
			MyThread2 th1=new MyThread2(ds);
			th.start();
			th1.start();

	}

}

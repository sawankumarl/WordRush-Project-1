
class MyThread extends Thread
{
MyThread()
{
	
}

MyThread(string name)
{
	super(name);
}

public void run()
{
	for(int i=0;i<3;i++)
	Thread t=Thread.currentThread();
try
{
	Thread.sleep(3000);
}catch(InterruptedException ie)
{
	System.out.println(ie);
}
System.out.println(t.getName());
}
}

class DemoThread()
{
	public statie void main(String args[])
	{
		Thread t1=Thread.currentThread();
		t1.setThread("Parent thread");
		System.out.println(t1.getName());
		
		MyThread mt1=new MyThread();
		mt1.setName("Child thread 1");
		mt1.start();
		
		MyThread mt2=new MyThread("Child Thread"); //construct call 
		mt2.start();
		
		try
		{
			mt1.join();
			mt2.join();
		}catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		System.out.println("Exit of main");
	}
}
		
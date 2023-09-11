package lambdaex;


public class thread2 
{
public static void main(String args[])
{
	Runnable runnable=()->
	{
		System.out.println("from thread of lambda");
	};
	Thread t=new Thread(runnable); //passing the object of runnable 
	t.start();// calling the abstract method run 
}
}

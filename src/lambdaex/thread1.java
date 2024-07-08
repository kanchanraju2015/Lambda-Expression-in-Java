package lambdaex;

class sp implements Runnable  // Runnable is functional interface i.e single abstract method defined i.e run
{
	public void run()
	{
		System.out.println("from run method of Runnable");
	}
}
public class thread1 
{
public static void main(String args[])
{
	sp s=new sp();
	Thread t=new Thread(s);// passing the object of sp class just simple calling style 
	t.start();
	
}
}

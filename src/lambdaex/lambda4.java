package lambdaex;

import java.util.function.Consumer; // note here the package name please
// THIS IS THE TRADINAL WAY OF CALLING THE CONSUMER INTERFACE
class ak implements Consumer<String>
{
	@Override // accept() takes just one input 
	public void accept(String msg)// Consumer has single abstract method accept with no return 
	{
		System.out.println("message is "+msg);
	}
}
public class lambda4 
{
public static void main(String args[])
{
Consumer<String> a=new ak();// note this line also valid statement
a.accept("welcome");// calling the interface method 
}
}

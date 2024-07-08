package lambdaex;

import java.util.function.Consumer; // note here the package name please
// THIS IS THE TRADINAL WAY OF CALLING THE CONSUMER INTERFACE
class ak implements Consumer<String>// use of generics note this 
{
	@Override // accept() takes just one input 
	public void accept(String msg)// Consumer has single abstract method accept with no return 
	{
		System.out.println("message is "+msg);// this is not return statement  note this 
	}// this is traditional style for lambda expression calling 
}
// this is traditional method of calling consumer 
public class lambda4 
{
public static void main(String args[])
{
Consumer<String> a=new ak();// note this line also valid statement
a.accept("welcome");// calling the interface method
Consumer<String> csm=(msg)->System.out.println("value is "+msg);
csm.accept("hello consumer");
}
}

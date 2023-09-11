package lambdaex;

import java.util.function.Function; // note the package name important here 

public class lambda3
{
public static void main(String args[])
{
	Function<String,Integer> function=(msg)->msg.length();// no return and data type mention 

	System.out.println(function.apply("welcome"));// calling the abstract method of interface 
}
}

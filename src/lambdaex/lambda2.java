package lambdaex;

import java.util.function.Function; // note the package name is function 
//  THIS IS THE TRADITIONAL WAY OF USINGFUNCTIONAL INTERFACE 
class jk implements Function<String,Integer>// jk class implements Function interface 
{
@Override //
public Integer apply(String msg) // returns Integer apply is the abstract method of Function interface
{
	return msg.length();// returns the length of string passed
}
}
public class lambda2 
{
public static void main(String args[])
{
jk j=new jk();
System.out.println(j.apply("hello java"));// calling interface method i.e returns integer as defined
}
}

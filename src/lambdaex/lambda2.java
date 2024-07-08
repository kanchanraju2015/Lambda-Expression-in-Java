package lambdaex;

import java.util.function.Function; // note the package name is function 
//  THIS IS THE TRADITIONAL WAY OF USING FUNCTIONAL INTERFACE 
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
Function<String,String> data=(msg)->msg.toUpperCase();
System.out.println(data.apply("hello lambda"));
Function<String,String> mydata=(msg)->
{
return 	msg.concat(" Ranchi city");// this is with return statement same output 
};// this is also valid statement can be minimized 
System.out.println(mydata.apply("hello lambda method"));// method must be called 
}
}

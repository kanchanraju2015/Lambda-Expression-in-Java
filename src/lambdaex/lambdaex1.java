package lambdaex;

@FunctionalInterface

interface a
{
int call(int x);// parameterized and with return type method 
}

public class lambdaex1
{
public static void main(String args[])
{
	/*
a ob=(i)->
{
	return i*i;// with return statement 
};
System.out.println(ob.call(4));
*/
	a ob=(k)->k*k;  // with no return statement and data type mention 
	System.out.println(ob.call(12));// calling the functional interface method
}
}

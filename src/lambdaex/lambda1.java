package lambdaex;

@FunctionalInterface
interface add
{
	void show(); // no parameter
}
@FunctionalInterface
interface kk
{
	void hello(int x); // single parameter
}
@FunctionalInterface
interface dd
{
	void demo(int x,int y);  // multiple parameter 
}
// THIS IS EXAMPLE OF VOID  TYPE FUNCTIONAL INTERFACE METHOD 
public class lambda1 
{
public static void main(String args[])
{
	add ld=()->	{   // no parameter
		System.out.println("from show method");
		};
		ld.show();	
	kk k=(p)-> // single parameter
	{
		System.out.println(p+p);
		};
		k.hello(15);
		
		dd d=(a,b)->   // multiple parameter
		{
			System.out.println(a+b);
		};
		d.demo(12,90);
		System.out.println("********************");
		
		add a=()->System.out.println("no params");// no parameter so valid statement of lambda 
		a.show();
		kk b=(data)->System.out.println("value is "+data);// this is single parameter valid lambda statement 
		b.hello(120);
		dd c=(i,j)->System.out.println(i+"      "+j);// this is also valid statement 
		c.demo(12,15);
		}
       }

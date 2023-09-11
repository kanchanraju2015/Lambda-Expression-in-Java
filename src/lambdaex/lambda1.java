package lambdaex;

@FunctionalInterface
interface add
{
	void show();
}
@FunctionalInterface
interface kk
{
	void hello(int x);
}
@FunctionalInterface
interface dd
{
	void demo(int x,int y);
}
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
		}
}

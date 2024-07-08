package lambdaex;

import java.time.LocalDateTime;// new feature of java 8
import java.util.function.Supplier;// also the feature of java

class ds implements Supplier<LocalDateTime>// this interface takes nothing but gives output only generics note  
{
	@Override
	public LocalDateTime get() // no input just output
	{
	return LocalDateTime.now();	
	}
}
public class lambda6 
{
public static void main(String args[])
{
Supplier<LocalDateTime> data=new ds();
System.out.println(data.get());
Supplier<LocalDateTime> dd=()->LocalDateTime.now();// no input just output 
System.out.println(dd.get());
}
}

package lambdaex;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class lambda7 
{
public static void main(String args[])
{
	Supplier<LocalDateTime> data=()->LocalDateTime.now();// no input 
	
	System.out.println(data.get());// calling the abstract method
}
}
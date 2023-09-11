package lambdaex;

import java.util.function.Consumer;

public class lambda5 
{
public static void main(String args[])
{
Consumer<String> consumer=(msg)->
{
	System.out.println("here is the message "+msg);// note returning the message
};
consumer.accept("hello john");// calling the accept method of consumer interface
}
}

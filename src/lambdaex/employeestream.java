package lambdaex;

import java.util.*;

public class employeestream
{
public static void main(String args[])
{
	// override the toString() in bean class for proper output 
Employee e=new Employee(19,"rannjan","ranchi",90);
Employee e1=new Employee(32,"manohar","tata",97);
Employee e2=new Employee(72,"chandan","patna",43);
Employee e3=new Employee(52,"abhinav","dhanbad",33);
Employee e4=new Employee(51,"mihir","paris",89);
Employee e5=new Employee(44,"minhazan","london",21);
Employee e6=new Employee(71,"vikash","patna",64);
Employee e7=new Employee(55,"mithun","bokaro",72);
Employee e8=new Employee(77,"ahay","ranchi",43);
ArrayList<Employee> emp=new ArrayList<Employee>();

emp.add(e);emp.add(e1);emp.add(e2);emp.add(e3);emp.add(e4);
emp.add(e5);emp.add(e6);emp.add(e7);emp.add(e8);

emp.stream().forEach(x->System.out.println(x));// all data print
emp.stream().limit(5).forEach(k->System.out.println(k)); // limit to 5 in output 
long count=emp.stream().count(); // total count of employees 
System.out.println("total employees are "+count);
System.out.println("filter by age>50");
emp.stream().filter(a->a.getAge()>50).forEach((a->System.out.println(a)));
System.out.println("filter by city==ranchi");
emp.stream().filter(a->a.getCity()=="ranchi").forEach((a->System.out.println(a)));
System.out.println("filter by age<50 and city ==ranchi");
emp.stream().filter(a->a.getCity()=="ranchi" && a.getAge()<50).forEach((a->System.out.println(a)));
long count1=emp.stream().filter(a->a.getCity()=="ranchi").count();
System.out.println(count1);
}
}

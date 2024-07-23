package com.graymatter;

//single abstract method related interface- functional interface
//lambda is a anonymous expression, functional interface, no obj expected, similar to inline functions, lambda operator ->

interface HelloInterface
{
	public String sayHello();	
}

interface printNameInterface
{
	public void printName(String name);
}

interface AdditionInterface
{
	public int add(int a,int b);
}

interface DisplayInterface
{
	public void display();
}

public class DemoOnLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloInterface hi= ()-> "hello..."; //giving definition in the same line,no paras & with return 
		System.out.println(hi.sayHello());
		
		printNameInterface pni =(name) -> System.out.println(name); //with paras & no return
		pni.printName("dhanya");
		
		AdditionInterface ai = (a,b) -> a+b; //with paras & with return
		System.out.println(ai.add(1, 2));
		
		DisplayInterface di = () -> System.out.println("inside display method"); //no paras & no return
		di.display();

	}

	
}

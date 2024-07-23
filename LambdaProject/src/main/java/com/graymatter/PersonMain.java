package com.graymatter;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person("dhanya",22,"23/3/2002");
		Person p2= new Person("abc",19,"23/3/2002");
		Person p3= new Person("def",34,"23/3/2002");
		Person p4= new Person("fgh",12,"23/3/2002");
		Person p5= new Person("Asd",33,"23/3/2002");
		
		ArrayList<Person> person= new ArrayList<Person>();
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		person.add(p5);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee(123,"dhanya",20000);
		Employee e2 = new Employee(124,"swapna",29000);
		Employee e3 = new Employee(125,"preethi",70000);
		Employee e4 = new Employee(126,"mohan",20000);
		Employee e5 = new Employee(127,"kriti",50000);		
		Employee e6 = new Employee(127,"kriti",30000);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.forEach(employee -> {           
			  if(employee.getSalary() > 50000) 
			  {                 
				  employee.setSalary(employee.getSalary() + 5000);             
			  }
			  else
			  { 
				  employee.setSalary(employee.getSalary() + 2000); 
			  } 
			  });
			  
		System.out.println(empList);
		
		Predicate<Person> predicate = pers ->pers.getAge()>35 && pers.getName().toLowerCase().startsWith("a");
		
		for(Person p:person){
			if(predicate.test(p))
			{
				System.out.println(p);
			}
		}
		
		
		
	
		

	}

}

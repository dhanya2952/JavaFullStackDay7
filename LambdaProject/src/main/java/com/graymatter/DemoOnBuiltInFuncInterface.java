package com.graymatter;

import java.util.ArrayList;
import java.util.function.*;

public class DemoOnBuiltInFuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> consumer =(i) -> System.out.println(i);
		consumer.accept(89);
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(55);
		alist.add(45);
		alist.add(67);
		alist.add(78);
		alist.add(23);
		alist.add(55);
		alist.forEach(consumer);
		
		System.out.println("--------------------------------");
		Supplier<String> supplier = () ->"hello";
		System.out.println(supplier.get());
		
		System.out.println("--------------------------------");
		Predicate<Integer> predicate =(num) -> num%2==0;		//always returns a boolean value
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i:arr)
			if(predicate.test(i))
				System.out.println(i);
		
		System.out.println("-----------------------------------");
		Function<Integer, Integer> function = (num) ->{
			int fact=1;
				for(int i=1;i<=num;i++)
					fact*=i;
			return fact;
		};
		System.out.println(function.apply(3));
		
	}

}

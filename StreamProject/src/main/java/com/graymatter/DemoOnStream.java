package com.graymatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoOnStream {
	public static void main(String[] args) {
		
		Integer arr[]= new Integer[]{1,2,3,4,5,6,7,8};
		List<Integer> list = Arrays.stream(arr)                    //Stream Generation
		.limit(10)
		.filter(i -> i%2==0)                  //Intermediate operation
		.map(i -> i+10)                       //Intermediate operation
//		.forEach(i -> System.out.println(i)); //terminal operation
		.collect(Collectors.toList());        //convert to list
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(12);
		alist.add(23);
		alist.add(12);
		alist.add(45);
		alist.add(89);
		alist.stream()
		.distinct()
		.forEach(i -> System.out.println(i));

		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("apple");
		al.add("orange");
		al.add("world");
		al.stream()
		.skip(2)
		.filter(i -> i.endsWith("e"))
		.map(i -> i.toUpperCase())
		.forEach(i -> System.out.println(i));
		
		System.out.println(alist.stream().reduce(0, (a,b) -> a+b ));
		
		Integer ar[] = new Integer[] {1,2,3,4,5,9,6};
		Arrays.stream(ar)
		.map(i -> {
			int f=1;
			for(int j=1;j<=i;j++)
				f*=j;
			return f;
		})
		.forEach(i -> System.out.println(i));
		
		System.out.println("--------------------------");
		System.out.println(Arrays.stream(ar).mapToInt(i -> i).sum());
		System.out.println(Arrays.stream(ar).mapToInt(i -> i).max());
		System.out.println(Arrays.stream(ar).mapToInt(i -> i).min());
		Arrays.stream(ar).mapToInt(i -> i).sorted().forEach(i -> System.out.println(i));


		
		System.out.println("--------------------------");
		al.stream()
		.filter(i -> i.length()>5)
		.map(i -> i.toUpperCase())
		.forEach(i -> System.out.println(i));
		
		System.out.println("--------------------------");
		System.out.println(Arrays.stream(ar).mapToInt(i -> i).sorted().skip(5).findFirst().getAsInt());
		System.out.println(Arrays.stream(ar).mapToInt(i -> i).sorted().limit(2).skip(1).findFirst().getAsInt());
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "dhanya");
		hm.put(2, "abc");
		hm.put(3, "def");
		Set<Entry<Integer, String>>entrySet =hm.entrySet();
		//entrySet.stream().filter(entry -> entry.getValue())
		
		
		//create a person class with the props name,age city aadhar num. 
		//create a hashset of n number of persons and check for whether person is eligble to cast vote
		//or else throw agenotsufficient exceptio using streams

		
		
		
	}

}

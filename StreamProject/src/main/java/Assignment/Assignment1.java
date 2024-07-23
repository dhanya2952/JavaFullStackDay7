package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Assignment1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//avg of list of doubles
		//a lambda expr to sort a list of strings in alpha order
		//lambda expr to check prime no
		//concat two strings
		//to count words in para
		Double arr[]= new Double[] {100.0,200.0,300.0,400.0,500.0};
		System.out.println(Arrays.stream(arr).mapToDouble(i -> i).average().getAsDouble());
		System.out.println("-----------------------");
		
		ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("jkl");
        list.add("mno");
        list.add("bcd");
        list.add("pqr");
        
        list.sort((s1, s2) -> s1.compareTo(s2));
        for (String str : list) 
            System.out.println(str);
        System.out.println("---------------------------");
        
        List<Integer> nums = Arrays.asList(2, 3, 5, 7, 9, 11, 13,22,34,56);
        isPrime(nums, n -> 
        {
            if (n <= 1) 
                return false;
            
            for (int i = 2; i <= Math.sqrt(n); i++) 
            {
                if (n % i == 0) 
                    return false;
            }
            return true;
        });
        
        System.out.println("-----------------------------");
        String str1 = "Hello ";
        String str2 = "world";

        Function<String, Function<String, String>> concat = s1 -> s2 -> s1.concat(s2);
        System.out.println("concat string: " + concat.apply(str1).apply(str2));
        System.out.println("------------------------------");
        
        String para ="Hello. Welcome to my workspace";
        Function<String, Integer> count = str -> 
        {
            String[] wArr = str.trim().split("\\s+");
            return wArr.length;
        };
        System.out.println(count.apply(para));
        System.out.println("------------------------------");

    }
  

public static void isPrime(List<Integer> numbers, Predicate<Integer> primeCheck) {
        for (int number : numbers) 
        {
            if (primeCheck.test(number)) 
                System.out.println(number);

		
	}

}
}

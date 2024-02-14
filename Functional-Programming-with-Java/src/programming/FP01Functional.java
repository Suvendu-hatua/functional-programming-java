package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=List.of(12,11,2,3,4,5,6,7);
//		printAllNumbersFunctional(numbers);
		printEvenNumbersFunctional(numbers);

	}

	public static void print(int num) {
		System.out.println(num);
	}
	
	public static boolean isEven(int num) {
		return num%2==0;
	}
	
	public static void printEvenNumbersFunctional(List<Integer> numbers) {
		//printing all the even numbers without using lambda expression
		numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
		
		//printing all the even numbers using lambda expression
		numbers.stream().filter(num->num%2==0).forEach(System.out::println);
	}
	
	
	private static void printAllNumbersFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
//		print all the numbers by using stream() and method reference
		
		//one approach without using method reference
		numbers.stream().forEach(ele->System.out.println(ele));
		
		System.out.println("**************");
		
		//another approach using method reference
		numbers.stream().forEach(FP01Functional::print);
		
		
	}

}

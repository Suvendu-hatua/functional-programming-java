package programming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FP10_FunctionalProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hiii");
		
		// create a stream of first 10 numbers. Numbers are created dynamically.
		
		//**********************Important Note *******************
		// in range(x,y) function----> x is inclusive and y is exclusive.
		
		IntStream.range(1, 10).forEach(System.out::println);
		
		System.out.println("Y as inclusive.....");
		//In order to take y as inclusive it's syntax will be something difference.
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		//*************Important Note *********************
		//If it is IntStream then we can directly apply utility methods.
		//like  -----> sum(),average(),count().
		
		//create a dynamic stream of first 10 odd numbers.
		//Byfault---> it will generate an infinite loop.
//		IntStream.iterate(1, e->e+2).forEach(System.out::println);;
		
		System.out.println("***************first 10 odd numbers*********************");
		IntStream.iterate(1, e->e+2).limit(10).forEach(System.out::println);
		
		System.out.println("*************first 10 even numbers****************");
		IntStream.iterate(2, e->e+2).limit(10).forEach(System.out::println);
		
		//print a stream like--->2,4,8,16,32,64,128,256.
		System.out.println("************printing pattern***************");
		IntStream.iterate(2, e->e*2).limit(10).forEach(System.out::println);
		
		//create a dynamic list and store it as a list.
		
		List<Integer> newList=IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		
		System.out.println(newList);
		
	}

}

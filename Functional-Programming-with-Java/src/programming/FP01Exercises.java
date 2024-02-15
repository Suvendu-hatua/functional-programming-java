package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FP01Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercise 1--->printing all the odd numbers
		List<Integer> numbers=Arrays.asList(12,33,2,4,5,7,9,8,10);
		System.out.println("Printing all the odd numbers....");
		numbers.stream().filter(num->num%2!=0).forEach(System.out::println);
		
		//Exercise 2--->print all the courses individually
		List<String> courseList=List.of("API","Spring","Spring Boot","Angular","JavaScript","Microservices","Spring Security");
		System.out.println("All the courses.....");
		courseList.stream().forEach(System.out::println);
		
		//Exercise 3 --->print the courses that contains 'Spring' word
		System.out.println("All the courses that contains 'Spring' word.....");
		courseList.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
		
		//Exercise 4--->print all the courses those have atleast 4 letters.
		System.out.println("All the courses that have atleast 4 letters...");
		courseList.stream().filter(course->course.length()>=4).forEach(System.out::println);
		
		//Exercise 5 --->print the cubes of all the odd numbers.
		System.out.println("Printing the cubes of all the odd numbers....");
		numbers.stream().filter(num->num%2!=0).map(num->num*num*num).forEach(System.out::println);

		//Exercise 6--->print the number of characters in each  of the course name.
		System.out.println("Printing the number of characters in each of the course name....");
//		courseList.stream().forEach(course->System.out.println(course.length()));
		courseList.stream().map(course->course.length()).forEach(System.out::println);
		
		//Exercise 7 ----> find square of each number in a list and sum them.
		System.out.println("find square of each number in a list.....");
		numbers.stream().map(num->num*num).forEach(System.out::println);
		System.out.println("find square of each number in a list and sum them...");
		int sum=numbers.stream().map(num->num*num).reduce(0,Integer::sum);
		System.out.println(sum);
		
		//Exercise 8 ---->Cube every numbers in the list and find sum of them.
		int sumOfCubes=numbers.stream().map(num->num*num*num).reduce(0, (x,y)->x+y);
		System.out.println("Cube every numbers in the list and find sum of them...");
		System.out.println(sumOfCubes);
		
		//Exercise 9 ----> Find sum of odd numbers in the list.
		int sumOfOdds=numbers.stream().filter(num->num%2!=0).reduce(0,(x,y)->x+y);
		System.out.println("Find sum of odd numbers in the list.");
		System.out.println(sumOfOdds);
	}

}

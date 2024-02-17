package programming;

import java.util.Comparator;
import java.util.List;

public class FP08_UtilityFunctions_CustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Course> courseList=List.of(
				new Course("Spring", "Framework", 94, 13000),
				new Course("SpringBoot", "Framework", 95, 12000),
				new Course("API", "Microservices", 90, 89000),
				new Course("AWS", "Cloud", 89, 13000),
				new Course("Microservices", "Microservices", 91, 90000),
				new Course("Selenium", "Framework", 87, 18000),
				new Course("Docker", "cloud", 95, 23000),
				new Course("Jenkins", "Cloud", 97, 20000)
			);
		
//		System.out.println(courseList);
		
		//max
		System.out.println("*****************Finding maximum***************");
		List<Integer> list=List.of(12,3,4,5,6,7,8,9,99);
		//finding max number amoung all the numbers from the list.
		//if it is primitive data types----> follow the bellow syntax.
		int maxNum=list.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(maxNum);
		
		//if it is Custom data type-----> follow the bellow syntax.
		//find the course that has maximum no of students enrolled.
		
		//********************************Approach 1 *******************************
		Comparator<Course>basedOnStudents=Comparator.comparing(Course::getNoOfStudents);
		System.out.println(
		courseList.stream().max(basedOnStudents).orElse(new Course("Jenkins", "Cloud", 97, 20000))
		);
		
		//******************************Approach 2 *****************************
		//natural order sorting means---> increasing order.
		Comparator<Course>basedOnStudentsDesc=Comparator.comparing(Course::getNoOfStudents).reversed();

		System.out.println(
		courseList.stream().sorted(basedOnStudentsDesc).findFirst().orElse(new Course("Jenkins", "Cloud", 97, 20000))
		);
		
		//min
		
		System.out.println("*****************Finding minimum***************");
		
		System.out.println(courseList.stream().min(basedOnStudents));
		
		//findFirst
		System.out.println("*****************Finding first Element***************");
		
		System.out.println(courseList.stream().findFirst());
		
		//findAny
		
		System.out.println("*****************Finding Any Element***************");
		System.out.println(courseList.stream().findAny());

		
	}

}

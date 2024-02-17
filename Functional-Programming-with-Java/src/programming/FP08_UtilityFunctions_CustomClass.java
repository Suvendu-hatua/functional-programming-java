package programming;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FP08_UtilityFunctions_CustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Course> courseList = List.of(new Course("Spring", "Framework", 94, 13000),
				new Course("SpringBoot", "Framework", 95, 12000), new Course("API", "Microservices", 90, 89000),
				new Course("AWS", "Cloud", 89, 13000), new Course("Microservices", "Microservices", 91, 90000),
				new Course("Selenium", "Framework", 87, 18000), new Course("Docker", "Cloud", 95, 23000),
				new Course("Jenkins", "Cloud", 97, 20000));

//		System.out.println(courseList);

		// max
		System.out.println("*****************Finding maximum***************");
		List<Integer> list = List.of(12, 3, 4, 5, 6, 7, 8, 9, 99);
		// finding max number amoung all the numbers from the list.
		// if it is primitive data types----> follow the bellow syntax.
		int maxNum = list.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(maxNum);

		// if it is Custom data type-----> follow the bellow syntax.
		// find the course that has maximum no of students enrolled.

		// ********************************Approach 1 *******************************
		Comparator<Course> basedOnStudents = Comparator.comparing(Course::getNoOfStudents);
		System.out.println(courseList.stream().max(basedOnStudents).orElse(new Course("Jenkins", "Cloud", 97, 20000)));

		// ******************************Approach 2 *****************************
		// natural order sorting means---> increasing order.

		Comparator<Course> basedOnStudentsDesc = Comparator.comparing(Course::getNoOfStudents).reversed();

		System.out.println(courseList.stream().sorted(basedOnStudentsDesc).findFirst()
				.orElse(new Course("Jenkins", "Cloud", 97, 20000)));

		// min

		System.out.println("*****************Finding minimum***************");

		System.out.println(courseList.stream().min(basedOnStudents));

		// findFirst
		System.out.println("*****************Finding first Element***************");

		System.out.println(courseList.stream().findFirst());

		// findAny

		System.out.println("*****************Finding Any Element***************");
		System.out.println(courseList.stream().findAny());

		// find total no of students enrolled in each course.
		System.out.println("Total no of Students.......");
		System.out.println(courseList.stream().mapToInt(course -> course.getNoOfStudents()).sum());

		// find total no of students where review score is >=90;
		System.out.println("find total no of students where review score is >=90....");
		System.out.println(courseList.stream().filter(course -> course.getReviewScore() >= 90)
				.mapToInt(Course::getNoOfStudents).sum());

//		find average no of students where review score is >=90
		System.out.println("find average no of students where review score is >=90....");
		double avg = courseList.stream().filter(course -> course.getReviewScore() >= 90)
				.mapToInt(Course::getNoOfStudents).average().getAsDouble();
		System.out.println(avg);

		// find total no of courses that's review score is >=90;
		System.out.println("find total no of courses that's review score is >=90....");
		long totalCourse = courseList.stream().filter(course -> course.getReviewScore() >= 90).count();
		System.out.println(totalCourse);

		// find the course that has maximum review Score.
		System.out.println("find the course that has maximum review Score.....");
		System.out.println(courseList.stream().max(Comparator.comparing(Course::getReviewScore)).get());

		// find the maximum no of students where review score is >=90;
		System.out.println("find the maximum no of students where review score is >=90....");
		int max = courseList.stream().filter(course -> course.getReviewScore() >= 90).mapToInt(Course::getNoOfStudents)
				.max().getAsInt();
		System.out.println(max);

		// Mapping into Grouping By.

		// Grouping all the course based on course category.
		System.out.println("Grouping all the course based on course category.....");
		System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getCategory)));
//		{
//		Cloud=[name=AWS, category=Cloud, reviewScore=89, noOfStudents=13000, name=Docker, category=Cloud, reviewScore=95, noOfStudents=23000, name=Jenkins, category=Cloud, reviewScore=97, noOfStudents=20000], 
//		Microservices=[name=API, category=Microservices, reviewScore=90, noOfStudents=89000, name=Microservices, category=Microservices, reviewScore=91, noOfStudents=90000],
//		Framework=[name=Spring, category=Framework, reviewScore=94, noOfStudents=13000, name=SpringBoot, category=Framework, reviewScore=95, noOfStudents=12000, name=Selenium, category=Framework, reviewScore=87, noOfStudents=18000]
//		}

		//find a map that contains category as key and course count as value.
		Map<String,Long> hmp=courseList.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()));

		System.out.println(hmp);
		
		//find a map that contains category as key and course that has high
		Map<String, Optional<Course>>hh=courseList.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.maxBy(Comparator.comparing(Course::getNoOfStudents))));
		System.out.println(hh);
		
		//find a Map contains category as Key and List of courses of that category as values.
		Map<String, List<String>>hh1=courseList.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getName, Collectors.toList())));
		System.out.println(hh1);
	}

}

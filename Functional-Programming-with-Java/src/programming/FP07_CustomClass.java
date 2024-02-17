package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Course{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore
				+ ", noOfStudents=" + noOfStudents + "]";
	}
	
	
}

public class FP07_CustomClass {

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
		
		//allMatch,anyMatch and noneMatch
		
		System.out.println(courseList.stream().allMatch(course->course.getReviewScore()>90));
		
		System.out.println(courseList.stream().anyMatch(course->course.getReviewScore()>90));
		
		System.out.println(courseList.stream().noneMatch(course->course.getReviewScore()>100));

		
		//sorting courses based on no of students.
		System.out.println("Aesc order------>");
		Comparator<Course> basedOnStudents=Comparator.comparing(Course::getNoOfStudents);
		//by default comparing means---> increasing order.
		System.out.println(
		courseList.stream().sorted(basedOnStudents).collect(Collectors.toList())
		);
		
		//sorting based on students but in decreasing order.
		System.out.println("Desc order------>");
		Comparator<Course> basedOnStudentsDesc=Comparator.comparing(Course::getNoOfStudents).reversed();
		System.out.println(courseList.stream().sorted(basedOnStudentsDesc).collect(Collectors.toList()));
		
		//sorting based on two fields.
		System.out.println("Based on No of Students and ReviewScore---->");
		Comparator<Course> basedOnStudentsAndReviewScoreAesc=Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore);
        System.out.println(courseList.stream().sorted(basedOnStudentsAndReviewScoreAesc).collect(Collectors.toList()));
        
        //More Utility methods--->
        
        //1) skip method--->
        System.out.println(courseList.stream().sorted(basedOnStudentsAndReviewScoreAesc).skip(2).collect(Collectors.toList()));
        
        //2) limit method---->
        System.out.println(courseList.stream().sorted(basedOnStudentsAndReviewScoreAesc).limit(5).collect(Collectors.toList()));

        //3) skip and limit methods together.
        System.out.println(courseList.stream().sorted(basedOnStudentsAndReviewScoreAesc).skip(2).limit(3).collect(Collectors.toList()));

        //4)takeWhile Method ---->
        //it will continue the execution of the code until the specified condition is true.
        courseList.stream().takeWhile(course->course.getReviewScore()>=90).forEach(System.out::println);
        
        //5) dropWhile Method---->
	}

}

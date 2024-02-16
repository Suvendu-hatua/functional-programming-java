package programming;

import java.util.List;

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


	}

}

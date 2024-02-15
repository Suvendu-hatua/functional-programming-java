package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FP03_Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To find distinct numbers from a list or strings from a list-----> we use distinct() method.
		List<Integer> ll=List.of(12,2,3,12,3,4,56,7,4,5);
		System.out.println("All the Unique numbers....");
		ll.stream().distinct().forEach(System.out::println);
		
		ArrayList<String> arrList=new ArrayList<String>(Arrays.asList("AWS","API","JAVA","C++","JAVA","API","DOCKER","AWS"));
		System.out.println("printng all the distinct  string values.....");
		arrList.stream().distinct().forEach(System.out::println);

	}

}

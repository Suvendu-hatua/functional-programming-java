package programming;

import java.util.Comparator;
import java.util.List;

public class FP04_Sorting {
	public static void main(String[] args) {
		List<Integer> list=List.of(12,1,3,2,4,9,6,5,3,2,1);
		//Sorting the list in ascending order.
		System.out.println("Sorting the list in ascending order....");
		list.stream().sorted().forEach(System.out::println);
		
		//Sorting only the distinct elements in the list.
		System.out.println("Sorting only the distinct elements in the list...");
		list.stream().distinct().sorted().forEach(System.out::println);
		
		//sorting the list in descending order.
		System.out.println("sorting the list in descending order....");
		list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//******************working with string values******************
		List<String> strList=List.of("Java","Python","C++","Java","JavaScript","C++","C#");
		System.out.println("Sorting list values....");
		strList.stream().sorted().forEach(System.out::println);
		System.out.println("Sorting the values in descending order.....");
		strList.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//Custom order sorting......
		System.out.println("Custom order sorting the list values....");
//		strList.stream().distinct().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
		strList.stream().distinct().sorted(Comparator.comparing(str->str.length())).map(str->str+" "+str.length()).forEach(System.out::println);
		System.out.println("sorting list values based on length() in desc order.....");
        strList.stream().distinct().sorted(Comparator.comparing(str->str.length(),Comparator.reverseOrder())).map(str->str+" "+str.length()).forEach(System.out::println);
	}
}

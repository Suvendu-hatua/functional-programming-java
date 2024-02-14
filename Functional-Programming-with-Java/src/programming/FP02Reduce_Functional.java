package programming;

import java.util.Arrays;
import java.util.List;

public class FP02Reduce_Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(12,1,3,4,2,5,6,7,8);
		//sum of all the elements using Java Stream.-----> we are adding all the numbers to get the results.
//		int result= numbers.stream().reduce(0,(x,y)->x+y);
		int result=numbers.stream().reduce(0, Integer::sum);
		
		System.out.println(result);
	}

}

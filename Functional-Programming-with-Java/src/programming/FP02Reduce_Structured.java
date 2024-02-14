package programming;

import java.util.Arrays;
import java.util.List;

public class FP02Reduce_Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(12,1,3,4,2,5,6,7,8);
		//Traditional approach.
		System.out.println(addNumbers(numbers));
				
	}
	
	public static int addNumbers(List<Integer> numbers) {
		int sum=0;
		for(int num:numbers) {
			sum+=num;
		}
		return sum;
	}
	

}

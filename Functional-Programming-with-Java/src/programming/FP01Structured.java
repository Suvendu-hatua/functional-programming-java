package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printAllNumbersStructured(List.of(12,11,1,2,3,7,8));

	}

	private static void printAllNumbersStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		for(int number:numbers) {
			System.out.println(number);
		}
		
	}

}

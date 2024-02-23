package programming;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class FP11_WorkingWithBigNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// find factorial of 50;
		System.out.println(IntStream.rangeClosed(1,30).reduce(1, (x, y) -> x * y));
		
		//working with big numbers.
		BigInteger sum=IntStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply);

		System.out.println(sum);
	}

}

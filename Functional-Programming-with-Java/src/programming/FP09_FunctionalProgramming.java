package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FP09_FunctionalProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(12,13,23,3,3,3,3,450);
		
		//12,13,23,3,3,3,3,450---->all the values will be converted to Wrapper class.
		//list.stream()--->so it's type will be of ReferencePipeline.
		System.out.println(list.stream());
		
		System.out.println(Stream.of(12,1,1,1,1,1));
		
		//In order to create stream of Primitive values -----> follow the syntax.
		int[] arr= {12,12,1,2,28,34,5,6,9};
		
		// so here stream will be of type----> IntPipeline.
		System.out.println(Arrays.stream(arr));

	}

}

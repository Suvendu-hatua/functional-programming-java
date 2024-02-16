package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FP06_BehaviorParameterization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(12,1,2,3,4,5,6,7,8,10);
		
		BinaryOperator<Integer> accumulator = extracted();
		int sum=list.stream().reduce(0,accumulator);
		System.out.println(sum);
		
		
		Predicate<? super Integer> predicate = extracted1();
		Consumer<? super Integer> action = extracted2();
		extracted(list, x->x%2==0, action);
	}

	private static void extracted(List<Integer> list, Predicate<? super Integer> predicate,
			Consumer<? super Integer> action) {
		list.stream().filter(predicate).forEach(action);
	}

	private static Consumer<? super Integer> extracted2() {
		Consumer<? super Integer> action = System.out::println;
		return action;
	}

	private static Predicate<? super Integer> extracted1() {
		Predicate<? super Integer> predicate = x->x%2==0;
		return predicate;
	}

	private static BinaryOperator<Integer> extracted() {
		BinaryOperator<Integer> accumulator = Integer::sum;
		return accumulator;
	}

}

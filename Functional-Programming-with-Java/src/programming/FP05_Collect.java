package programming;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP05_Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> llList=List.of(12,2,3,1,2,3,4,5,6,7,8,9,10);
		List<Integer>newList=llList.stream().map(num->num*num).collect(Collectors.toList());
		System.out.println(newList);
	}

}

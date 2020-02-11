package java8;

import java.util.Arrays;
import java.util.List;

public class Java8Changes {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2,3,4,5,6,8);
		int factor = 2; // effectively final
		
		System.out.println(intList.stream().mapToInt(e -> e * factor)
										   .findAny());
		
//		factor = 3; code will work untill this line is commented
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}

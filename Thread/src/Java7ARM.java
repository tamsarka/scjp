import java.util.stream.Stream;

public class Java7ARM {
	public static void main(String[] args) {
		int n = 2;
		int k = 9;

		System.out.println("The result is "+compute(n, k));
		System.out.println("The result is "+decCompute(n, k));
	}

	private static double compute(int n, int k) {
		// return the total sqrt of k even numbers starting from n
		
		double result = 0;
		int count = 0;
		
		while(count < k) {
		
			if(isEven(n)) {
				result += sqrt(n);
//				System.out.println(n +"is even number"+	result);
				count ++;
			}
			n++;
//			System.out.println(n);
		}
				
		return result;
	}
	
	private static boolean isEven(int element) {
//		System.out.println("element :"+ element);
		return element % 2 == 0;
	}
	
	private static double sqrt(int element) {
		double val = Math.sqrt(element);
		System.out.println("element :-"+ val);
		return val;
	}
	
	private static double decCompute(int n, int k) {
		return Stream.iterate(n, e -> e + 1)
					.filter(Java7ARM :: isEven)
					.mapToDouble(Java7ARM::sqrt)
//					.mapToInt(Integer::intValue)
					.limit(k)
					.sum();
	}

}

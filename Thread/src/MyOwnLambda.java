import java.util.HashMap;
import java.util.Map;

public class MyOwnLambda {
	public static void main(String[] args) {
		MyFInterface myInt = (str, str1) -> System.out.println("String 1:" + str + " String 2 :" + str1);

		MyOwnLambda lam = new MyOwnLambda();
		System.out.println(41 / 2);
		int pairSize = lam.getPairOfSocks(new int[] { 10, 20, 30,10,10,10,20 });
		System.out.println(" Total pair size is :"+pairSize);

//		myInt.printIt("Tamal", "Sarkar");

	}

	private int getPairOfSocks(int[] sockList) {
//		List<Integer> listOfSocks = Arrays.stream(sockList).boxed().collect(Collectors.toList());
		Map<Integer, Integer> groupVal = new HashMap();
		for(int i : sockList) { 
			if(groupVal.get(i) == null) {
				groupVal.put(i, 1);
				System.out.println(" key :"+i );
			}else {
				int val = groupVal.get(i);
				System.out.println(" key :"+i +" val :"+val);
				groupVal.put(i, ++val);
			}
		}
		int totalPair = 0;
		for (Map.Entry<Integer, Integer> entry : groupVal.entrySet()) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	        totalPair += entry.getValue() / 2;
	    }
		
		return totalPair;
	}

}

@FunctionalInterface
interface MyFInterface {
	void printIt(String param1, String param2);
}

package Java;

/**
 * 
 * Print a single line of space-separated integers denoting the final state of
 * the array after performing left rotations.
 * 
 * Sample Input
 * 
 * 5 4 1 2 3 4 5 Sample Output
 * 
 * 5 1 2 3 4
 * 
 * @author P7111986
 *
 */
public class ArrayRotation {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5,6,7,8,9,10,11,12,13 };

		int d = 9;
		System.out.println(++d);
		System.out.println(d++);
		System.out.println(d);
		/*
		 * List<Integer> result = new ArrayList();
		 * 
		 * for (int i = d; i < (a.length + d); i++) { System.out.println(" i ="+i +
		 * " mod val :"+i % a.length); result.add(a[i % a.length]); }
		 * 
		 * System.out.println(result);
		 */
	}
}

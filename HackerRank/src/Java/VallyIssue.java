package Java;


/**https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
	
	 * Sample Input

8
UDDDUDUU
Sample Output

1
Explanation

If we represent _ as sea level, a step up as /, and a step down as \, Gary's hike can be drawn as:

_/\      _
   \    /
    \/\/
He enters and leaves one valley.
	 * @author P7111986
	 *
	 */
public class VallyIssue {
	public static void main(String[] args) {
		caluculateNumberOfVallyCrossed("DDUUDDUDUUUD");
	}
	
	private static int caluculateNumberOfVallyCrossed(String stepDetails) {
		char[] steps = stepDetails.toCharArray();
		int  totalMountCovered, totalVallyCovered;
		totalMountCovered = totalVallyCovered =  0;
		

		int lvl = 0;
		for(char ch : steps) {
			if(ch == 'U') {
				++lvl;
			}else {
				--lvl;
			}
			
			if(lvl == 0 && ch == 'U') {
				totalVallyCovered += 1;
			}else if(lvl == 0 && ch == 'D') {
				totalMountCovered += 1;
			}
		
		}
		System.out.println(" Mountain covered :"+ totalMountCovered + " Vally covered :"+totalVallyCovered);
		return totalVallyCovered;
		
	}

}

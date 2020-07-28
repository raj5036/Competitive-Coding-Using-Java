import java.util.*;
import java.util.stream.*;
public class Solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		int T = sc.nextInt();
		while (T-- > 0) {
			String s = sc.next();
			int[] counts = new int[3];
			for (char c : s.toCharArray()) {
				if (c == 'R') counts[0]++;
				else if (c == 'P') counts[1]++;
				else counts[2]++;
			}
			
			char best = 'P';
			if (counts[1] >= counts[0] && counts[1] >= counts[2]) best = 'S';
			if (counts[2] >= counts[0] && counts[2] >= counts[1]) best = 'R';
			
			for (int i = 0; i < s.length(); i++) System.out.print(best);
			System.out.println();
		}
	}
}
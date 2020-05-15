import java.util.*;
import java.io.*;
public class Pythogoriean{

	public static void main(String[] args) {
		int a[]={3, 12, 2, 13};
		for(int i=0;i<a.length;i++)
			a[i]=(int)Math.pow(a[i],2);
		Arrays.sort(a);
		//9,25,25,144,169
		// Set<Double> set=new HashSet<Double>();
		// for(int i=0;i<a.length;i++)
		// 	set.add(Math.pow(a[i],2));
		// Iterator<Double> i = set.iterator();
		// // System.out.println(set);
		// while(i.hasNext()){

		// }
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				for (int k=j+1;k<a.length;k++) {
					if(a[k]==a[i]+a[j])
						System.out.println("True");
				}
			}
		}
		System.out.println("False");
	}
}
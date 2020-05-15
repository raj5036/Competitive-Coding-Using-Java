/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class MissingElement {
    static int missingElement(int[] a){
        for(int i=0;i<a.length-1;i++){
            if((a[i]+1) != a[i+1])
                return a[i]+1;
        }
        return 0;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int t=1;t<=testCase;t++){
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    System.out.println(missingElement(a));
		}
	}
}
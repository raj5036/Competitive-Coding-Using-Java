import java.util.*;
class UnionAndIntersectionUsingArray{
	static void findUnion(int[] a,int[] b){
		int m=a.length;
		int n=b.length;
		int[] union=new int[m+n];
		int i=0,j=0,temp=0;
		while(i<m && j<n){
			if(a[i]<b[j]){
				union[temp]=a[i];
				i++;	
			}else if(a[i]>b[j]){
				union[temp]=b[j];
				j++;
			}else if(a[i]==b[j]){
				union[temp]=a[i];
				i++;
				j++;
			}
			temp++;
		}
		while(i<m){
			union[temp]=a[i];
			i++;
			temp++;
		}
		while(j<n){
			union[temp]=b[j];
			j++;
			temp++;
		}
		for(int k=0;k<temp;k++)
			System.out.println(union[k]);
	}
	public static void main(String[] args){
		int a[]={1,2,3,4,5};
		int b[]={3,4,5,6,8};
		findUnion(a,b);
		//int intr=findIntersection(a,b);
	}
}
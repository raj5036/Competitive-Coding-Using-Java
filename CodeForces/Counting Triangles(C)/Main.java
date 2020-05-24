import java.util.*;
public class Main{
	public static int noOfTriangles(int a,int b,int c,int d){
		int[] x=new int[b-a+1];
		int index=0;
		for(int i=a;i<=b;i++)
			x[index++]=i;
		index=0;
		int[] y=new int[c-b+1];
		for(int i=b;i<=c;i++)
			y[index++]=i;
		index=0;
		int[] z=new int[d-c+1];
		for(int i=c;i<=d;i++)
			z[index++]=i;
		index=0;
		int[] sum=new int[x.length*y.length];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<y.length;j++){
				sum[index++]=x[i]+y[j];
			}
		}
		index=0;

		int triangles=0;
		for(int i=0;i<z.length;i++){
			for(int j=0;j<sum.length;j++){
				if(sum[j]>z[i])
					triangles++;
			}
		}
		return triangles;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();

		System.out.println(noOfTriangles(a,b,c,d));
	}
}
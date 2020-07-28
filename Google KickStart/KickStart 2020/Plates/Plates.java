import java.util.*;
public class Plates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Plates obj=new Plates();
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int P=sc.nextInt();
            int[] a=new int[N];
            for(int i=0;i<N;i++)
                a[i]=sc.nextInt();
            System.out.println(obj.noOfHouses(a,N,B));
        }
    }
}
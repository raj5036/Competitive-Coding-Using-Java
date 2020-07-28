import java.util.*;
public class Allocation{
    int noOfHouses(int[] a,int N,int B){
        Arrays.sort(a);
        if(a[0]>B)
            return 0;
        int ans=0;
        for(int num:a){
            if(B<num || B<=0)
                break;
            B-=num;
            ans++;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Allocation obj=new Allocation();
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int B=sc.nextInt();
            int[] a=new int[N];
            for(int i=0;i<N;i++)
                a[i]=sc.nextInt();
            System.out.println(obj.noOfHouses(a,N,B));
        }
    }
}
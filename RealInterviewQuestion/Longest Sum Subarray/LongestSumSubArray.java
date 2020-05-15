import java.util.*;
class LongestSumSubArray{
    static int[] findLongestSubArray(int[] a,int Target){
        int curSum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=i;k<j;k++){
                    int ans=0;
                    ans += a[i];
                    if(ans==Target)
                        return new int[] {i,k};
                    else
                        ans=0;
                }
            }
        }
        return new int[] {0};
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a[]=new int[100];
        System.out.println("Array Size");
        int n=sc.nextInt();
        System.out.println("Array Elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Target");
        int Target=sc.nextInt();
        int[] ans=findLongestSubArray(a,Target);
        for(int i=0;i<ans.length;i++)
            System.out.println(ans[i]);
    }
}
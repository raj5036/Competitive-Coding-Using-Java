import java.util.*;
class ClosestToTarget{
    static void closestElements(int a[],int b[],int target){
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if( a[i]+b[j]==target){
                    System.out.println(a[i] + "\t" + b[j]);
                }
                else{
                    int targetUpper=target;
                    int targetLower=target;
                    while(a[i]+b[j]!=targetLower || a[i]+b[j]!=targetUpper){
                        targetUpper++;
                        targetLower--;
                    }
                    System.out.println(a[i] + "/t" + b[j]);
                }
            }
        }
    }
    public static void main(String[] args){
        int a[]={-1,3,8,2,9,5};
        int b[]={4,1,2,10,5,20};
        int target=24;
        closestElements(a, b, target);
    }
}
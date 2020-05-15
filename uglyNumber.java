 import java.lang.*;
 import java.util.*;
class GFG { 
    static int maxDivide(int a,int b){
        while(a%b==0){
            a=a/b;
        }
        return a;
    }
    static boolean isUgly(int n){
        n=maxDivide(n, 2);
        n=maxDivide(n, 3);
        n=maxDivide(n, 5);
        if(n==1)
            return true;
        return false;
    }
	int getNthUgly(int n){
        int[] ugly=new int[n];
        ugly[0]=1;
        int i2=0,i3=0,i5=0;
        int next_multiple_of_2=ugly[0]*2;
        int next_multiple_of_3=ugly[0]*3;
        int next_multiple_of_5=ugly[0]*5;
        int next_ugly_no=1;
        for(int i=1;i<n;i++){
            next_ugly_no=Math.min(next_multiple_of_2,Math.min(next_multiple_of_3,next_multiple_of_5));
            ugly[i]=next_ugly_no;
            if(next_ugly_no==next_multiple_of_2){
                i2++;
                next_multiple_of_2=ugly[i]*2;
            }
            if(next_ugly_no==next_multiple_of_3){
                i3++;
                next_multiple_of_3=ugly[i]*3;
            }
            if(next_ugly_no==next_multiple_of_5){
                i5++;
                next_multiple_of_5=ugly[i]*5;
            }
        }
        return next_ugly_no;
    }
    public static  void main(String args[]){
        GFG obj = new GFG();
        System.out.println(obj.getNthUgly(23));
        System.out.println(isUgly(2187));
    }
} 
 

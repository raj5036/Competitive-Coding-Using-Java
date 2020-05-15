import java.util.*;

class Factorial{
    static int fact(int n){
        if(n==0)
            return 1;
        else if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    static void stringReverse(String s){
    //   char[] arr = s.toCharArray();
    //   for(int i=arr.length-1;i>=0;--i)
    //         System.out.println(arr[i]);
        if((s==null) || (s.length()<=1))
            System.out.println(s);
        else{
            System.out.println(s.charAt(s.length()-1));
            stringReverse(s.substring(0,s.length()-1));
        }
    }
    static int palindrome(int n){
        int reverse=0,digit,real=n;
        do{
            digit=n%10;
            reverse=(reverse*10)+digit;
            n=n/10;
        }while(n!=0);
        if(real==reverse)
            return 1;
        else 
            return 0;
    }
    static int fibonacci(int n){
        if(n<=1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fact(3));
        stringReverse("Raj");
        System.out.println(palindrome(12321));
        System.out.println("Fibonacci");
        for(int i=0;i<=4;i++)
            System.out.println(fibonacci(i));
    }
}
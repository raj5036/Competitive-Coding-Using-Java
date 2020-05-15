import java.util.*;
import java.lang.*;
import java.io.*;

class StoringPrimeNos{
	static boolean isPrime(int n){
		if(n%2==0) return false;
		for(int i=2;i<n/2;i++){
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] prime=new int[10];
		int i=50,index=0,sum=0;
		while(index<5){
			if(isPrime(i)){
				prime[index]=i;
				index++;
			}
			i++;
		}

		System.out.println("\nThe arrays of Prime Numbers(From 50 onwards)\n");
		for(int k=0;k<index;k++)
				System.out.println(prime[k]);
		
		for(int k=0;k<index;k++)
			sum +=prime[k];
		System.out.println("The sum is : "+ sum);

	}
}
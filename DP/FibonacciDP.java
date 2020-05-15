import java.util.*;
import java.io.*;
public class FibonacciDP{
	static int getNthFibo(int n){
		if(n<=1) return n;
		else
			return getNthFibo(n-1)+getNthFibo(n-2);
	}
	public static void main(String[] args) {
		int n=4;
		System.out.println(getNthFibo(n));
	}
}
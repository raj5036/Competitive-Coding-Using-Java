import java.util.*;
import java.lang.*;
import java.io.*;
class MultiplicationTable{
	static void printTable(int n,int i){
		if(i>0)
			printTable(n,i-1);
		System.out.println(n+" * "+i+"="+n*i);
	}
	public static void main(String[] args) {
		printTable(5,10);
	}
}
import java.util.*;
public class Fibonacci{
	public int fibonacci(int n,Map<Integer,Integer> lookupTable){
		if(n<=1)
			return n;
		else{
			if(!lookupTable.containsKey(n)){
				int value=fibonacci(n-1,lookupTable)+fibonacci(n-2,lookupTable);
				lookupTable.put(n,value);
			}
			return lookupTable.get(n);
		}
	}
	public static void main(String[] args) {
		Fibonacci obj=new Fibonacci();
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> lookupTable=new HashMap<Integer,Integer>();
		int n=sc.nextInt();
		System.out.println(obj.fibonacci(n,lookupTable));
	}
}
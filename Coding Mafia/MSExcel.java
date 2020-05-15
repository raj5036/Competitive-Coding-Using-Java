import java.util.*;
class MSExcel{
	static char findColumn(int n){
		int columnNo=1;
		char i='A';
		while(i<='A' && i>='Z'){
			if(columnNo==n) break;
			i=(char)columnNo;
			columnNo++;
			i++;	
		}
		return i;
	}
	public static void main(String[] args){
		int n=23;
		System.out.println(findColumn(n));
	}
}

class Snake{
	static boolean willReachEnd(String s1,String s2){
		int i=0,j=0;
		while(i<=s1.length() && j<=s2.length()){
			if(s1.charAt(i)=='.'){
				if(i==s1.length()-1) return true;
				i++;  //i=3
				if(s1.charAt(i)=='#'){
					j=i-1;
				}
			}else if(s2.charAt(j)=='.'){ //j=3
				if(j==s2.length()-1) return true;
				j++;
				if(s2.charAt(j)=='#') {
					i=j-1;
				}
			}else break;
		}
	
		return false;
	}
	public static void main(String[] args){
		String s1="...#.#";
		String s2="##..##";
		System.out.println(willReachEnd(s1,s2));
	}
}
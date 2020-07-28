import java.util.*; 
public class RabinKarp{
	static int pow(int x,int y){
		if(y==0)
			return 1;
		if(y==1)
			return x;
		if(y%2==0)
			return pow(x,y/2)*pow(x,y/2);
		else
			return x*pow(x,y/2)*pow(x,y/2);
	}
	static final int d=256,q=101;
	static void rabinKarp(String text,String pattern){
		int i=0,j=0;
		int t=0,p=0;
		int h=0;
		int N=text.length(),M=pattern.length();
		
		h=pow(d,M-1)%q; //Hash Function

		for(i=0;i<M;i++){      //HashCode of the pattern and String
			t=(d*t+text.charAt(i))%q;
			p=(d*p+pattern.charAt(i))%q;
		}

		for(i=0;i<=N-M;i++){
			if(p==t){
				for(j=0;j<M;j++)
					if(pattern.charAt(j)!=text.charAt(i+j))
						break;
				if(j==M)
					System.out.println("pattern found at "+i);

			}
			if(i<N-M){
				t=(d*(t - text.charAt(i)*h) + text.charAt(i+M))%q;
				if(t<0)
					t=t+q;
			}
		}
	}
	public static void main(String[] args) {
		String text="ababazzabahjhakzzahdihihuiwqeozza";
		String pattern="zza";
		rabinKarp(text,pattern);
	}
}
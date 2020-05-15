import java.util.*;
import java.io.*;
class hj{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++){
            int type=sc.nextInt();
            if(type==1){
                int side=sc.nextInt();
                System.out.println(Math.pow(side,2));
            }else if(type==2){
                int L=sc.nextInt();
                int R=sc.nextInt();
                int area=(1/2)*L*R;
                System.out.println(area);
            }
        }
    }
}
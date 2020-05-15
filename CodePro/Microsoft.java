import java.util.*;
class MicroSoft{
    static void addIntegers(int a,int b){
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        LinkedList<Integer> res = new LinkedList<Integer>();
    
        int real_a=a,rev_a,real_b=b,rev_b;
        int result=real_a+real_b,real_result=result;
        do{
            int digit=a%10;
            list1.add(digit);
            a=a/10;
        }while(a!=0);
        do{
            int digit=b%10;
            list2.add(digit);
            b=b/10;
        }while(b!=0);
        do{
            int digit=result%10;
            res.add(digit);
            result=result/10;
        }while(result!=0);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(res);
        System.out.println(real_result);
    }
    public static void main(String[] args){
        addIntegers(423, 577);
    }
}
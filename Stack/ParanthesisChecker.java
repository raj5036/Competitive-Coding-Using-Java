import java.util.*;

 class CheckPair{
    static final int size=23;
    //static public abstract int add();
    static CheckPair obj = new CheckPair();
    static boolean isPerfectPair(Character c1,Character c2){
        if(c1=='(' && c2==')')
            return true;
        else if(c1=='{' && c2=='}')
            return true;
        else if(c1=='[' && c2==']')
            return true;
        return false;
    }
    static void push(char[] x){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<x.length;i++){
            if(x[i]=='(' || x[i]=='{' || x[i]=='[')
                stack.push(x[i]);
            else if(x[i]==')' || x[i]=='}' || x[i]==']'){
                Character c1=stack.pop();
                if(!isPerfectPair(c1 , x[i])){
                    System.out.println("Not Balanced");
                    break;
                }
            }
        }
        if(stack.empty())
            System.out.println("Balanced");
        else    
            System.out.println("Not Balanced");
    }
    private static void string(){
         String s1="Hello";
        String s2 = new String("Hello");
        StringBuffer s3=new StringBuffer("Hello");
        int c;
        //System.out.println(c++);
        System.out.println("GetClass Method");
        System.out.println(obj.getClass());
        System.out.println("InstanceOf");
        System.out.println(obj instanceof CheckPair);

        boolean n=s1.equals(s2);
        System.out.println(s1==s2);
        System.out.println(n);
        System.out.println(s3.equals(s1));
    }
    public static void main(String[] args) {
       char[] exp={'(','{','}',')'};
        push(exp);
    }
}
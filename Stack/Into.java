import java.lang.*;
import java.util.*;
class  Test{
    static void push(Stack<Integer> stack,int n){
        for(int i=0;i<n;i++){
            stack.push(i);
        }
    }
    static int search(Stack<Integer> stack,int key){
        int pos=stack.search(key);
        if(pos==-1)
            return 0;
        return pos;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        push(stack, 5);
        Integer top = stack.peek();
        System.out.println(top);
        System.out.println(search(stack, 78));
    }
}
import java.util.EnumSet;

class Node{
    int data;
    Node left,right;
    
    Node(int key){
        this.data=key;
        this.right=this.left=null;
    }
    static void inOrder(Node root){
        if(root==null) return;
        else{
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
    static void preOrder(Node root){
        if(root==null) return;
        else{
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) throws NullPointerException{
        Node root=new Node(12);
        root.left=new Node(1);
        root.right=new Node(54);
        root.left.left=new Node(44);
        System.out.println("InOrder");
        inOrder(root);
        System.out.println("PreOrder");
        preOrder(root);
    }
}
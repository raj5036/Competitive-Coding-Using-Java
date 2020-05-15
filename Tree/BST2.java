import java.util.*;
class BST{
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int key){
			data=key;
			left=right=null;
		}
	}
	Node root;
	BST(){
		root=null;
	}
	void insert(int key){
		insertRec(root,key);
	}
	Node insertRec(Node root,int key){
		if(root==null){
			root=new Node(key);
		}else{
			if(key<root.data) root.left=insertRec(root.left,key);
			else if(key>root.data) root.right=insertRec(root.right,key);
		}
		return root;
	}
	void inOrder(){
		inOrderRec(root);
	}
	void inOrderRec(Node root){
		if(root!=null){
			inOrderRec(root.left);
			System.out.println(root.data);
			inOrderRec(root.right);
		}
	}
	public static void main(String[] args){
		BST tree=new BST();
		tree.insert(12);
		tree.insert(13);
		tree.insert(11);
		tree.inOrder();
	}
}
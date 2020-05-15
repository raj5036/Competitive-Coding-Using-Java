import java.util.*;
import java.io.*;
import java.lang.*;
 class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
class BinaryTree{
	static Node root;
	BinaryTree(){
		root=null;
	}
	BinaryTree(int data){
		root=new Node(data);
	}
	void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	void levelOrder(Node root){
		if(root!=null){
			Queue<Node> queue=new LinkedList<Node>();
			queue.add(root);
			while(!queue.isEmpty()){
				Node node=queue.poll();
				System.out.println(node.data);
				if(node.left!=null) queue.add(node.left);
				if(node.right!=null) queue.add(node.right);
			}
		} 
	}
	Node insertNode(Node root,int key){
		if(root==null) return new Node(key);
		else{
			if(key>root.data) root.right=insertNode(root.right,key);
			else if(key<root.data) root.left=insertNode(root.left,key);
		}
		return root;
	}
	int heightOfTheTree(Node root){
		if(root==null) return 0;
		else{
			int leftHeight=heightOfTheTree(root.left);
			int rightHeight=heightOfTheTree(root.right);
			if(leftHeight>rightHeight) return leftHeight+1;
			return rightHeight+1;
		}
	}
	int minValueNode(Node root){
		Node current=root;
		while(current.left!=null){
			current=current.left;
		}
		int minVal=current.data;
		return minVal;
	}
	
	Node delete(Node root,int key){
		if(root==null) return root;
		else if(key<root.data) root.left=delete(root.left,key);
		else if(key>root.data) root.right=delete(root.right,key);
		else{
			//if node to be deleted has only one child
			if(root.left==null) return root.right;
			else if(root.right==null) return root.left;
			//if node to be deleted has two child
			root.data=minValueNode(root.right);
			root.right = delete(root.right, root.data); 
		}
		return root;
	}
	public static void main(String[] args) {
		BinaryTree bst=new BinaryTree(12);
		bst.insertNode(root,34);
		bst.insertNode(root,11);
		bst.insertNode(root,10);;
		bst.insertNode(root,9);
		System.out.println("InOrder Traversal");
		bst.inOrder(root);
		System.out.println("LevelOrder Traversal");
		bst.levelOrder(root);
		System.out.println("Height of the tree : "+bst.heightOfTheTree(root));
		System.out.println("The minValueNode is : " + bst.minValueNode(root));
		bst.delete(root,9);
		bst.inOrder(root);
	}
}
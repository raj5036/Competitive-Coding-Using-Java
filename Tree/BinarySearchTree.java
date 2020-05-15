import java.util.*;
import java.io.*;
class Node{
	int data;
	Node left,right;
	public Node(int key){
		this.data=key;
		this.left=this.right=null;
	}
}
class BinarySearchTree{
	Node root;
	public BinarySearchTree(){
		root=null;
	}
	public BinarySearchTree(int key){
		root = new Node(key);
	}
	void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	void preOrder(Node root){
		if(root!=null){
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	void postOrder(Node root){
		if(root!=null){
			postOrder(root.right);
			postOrder(root.left);
			System.out.println(root.data);
		}
	}
	Node insertNode(Node root,int key){
		if(root==null) return new Node(key);
		else{
		
			if(key<root.data) root.left=insertNode(root.left,key);
			else if(key>root.data) root.right=insertNode(root.right,key);
		}
		return root;
	}
	Node searchNode(Node root,int key){
		if(root==null || root.data==key) return root;
		else if(key<root.data) searchNode(root.left,key);
		else searchNode(root.right,key);
		return root;
	}
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.root=new Node(12);
		tree.root.left=new Node(11);
		tree.root.right=new Node(13);
		System.out.println("inOrder");
		tree.inOrder(tree.root);
		System.out.println("postOrder");
		tree.postOrder(tree.root);
		System.out.println("preOrder");
		tree.preOrder(tree.root);
		tree.insertNode(tree.root,45);
		tree.inOrder(tree.root);
		Node searchNode=tree.searchNode(tree.root,45);
		System.out.println("searchNode data "+searchNode.data);
	}
}
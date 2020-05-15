import java.util.*;

public class Main{
	static class Node{
		int val;
		Node left,right;
		Node(int x){
			this.val=x;
			this.left=this.right=null;
		}
	}
	public int getLevel(Node root,Node ptr,int lev){ //Pass the 'lev' as 0
		if(root==null)
			return 0;
		if(root.val==ptr.val)
			return lev;
		int level=getLevel(root.left,ptr,lev+1);
		if(level!=0)
			return level;
		else return getLevel(root.right,ptr,lev+1);
	}
	public boolean areSiblings(Node root,Node ptr1,Node ptr2){
		if(root==null)
			return false;
		return ((root.left==ptr1 || root.left==ptr2) && (root.right==ptr1 || root.right==ptr2))
				||
				(areSiblings(root.left,ptr1,ptr2) ||areSiblings(root.right,ptr1,ptr2));
	}
	public boolean areCousins(Node root,Node ptr1,Node ptr2){
		if(root==null) 
			return 0;
		return !areSiblings(root,ptr1,ptr2) && (getLevel(root,ptr1,0)==getLevel(root,ptr2,0));
	}
	public static void main(String[] args) {
			
	}
}
import java.util.*;
import java.io.*;
import java.lang.*;
class LinkedListOP{
	static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=new Node(45);
	void append(int key){
		Node new_node=new Node(key);
		head.next=new_node;
	}
	void printList(Node head){
		Node current=head;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}	
	static Node findMiddle(Node head){
		Node fast=head;
		Node slow=head;
		while(fast.next!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	Node mergeSort(Node head){
		if(head==null || head.next==null) return head;
		else{
			Node middleNode=findMiddle(head);
			Node nextOfMiddleNode=middleNode.next;
			middleNode.next=null;
			Node left=mergeSort(head);
			Node right=mergeSort(nextOfMiddleNode);
			Node sortedListHead=sortedMerge(left,right);
			return sortedListHead;
		}
	}
	static Node sortedMerge(Node a,Node b){
		Node result;
		if(a==null) return b;
		if(b==null) return a;
		else{
			if(a.data<=b.data){
				result=a;
				result.next=sortedMerge(a.next,b);
			}else{
				result=b;
				result.next=sortedMerge(a,b.next);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		LinkedListOP obj=new LinkedListOP();
		obj.append(12);
		obj.append(4545);
		obj.append(673);

		obj.printList(obj.head);	
	}
}
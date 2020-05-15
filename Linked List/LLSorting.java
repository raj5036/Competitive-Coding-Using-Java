import java.util.*;
import java.io.*;
import java.lang.*;
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
class LinkedListSorting{
	void append(Node head,int data){
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		Node newNode=new Node(data);
		last.next=newNode;
	}
	Node findMiddle(Node head){
		Node fast=head,slow=head;
		while(fast.next!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	Node sortedMerge(Node a,Node b){
		Node result=null;
		if(a==null) return b;
		if(b==null) return a;
		if(a.data<=b.data){
			result=a;
			result.next=sortedMerge(a.next,b);
		}else{
			result=b;
			result.next=sortedMerge(a,b.next);
		}
		return result;
	}
	Node mergeSort(Node head){
		if(head==null || head.next==null) return head;

		Node middleNode=findMiddle(head);
		Node nextOfMiddleNode=middleNode.next;
		middleNode.next=null;
		Node left=mergeSort(head);
		Node right=mergeSort(nextOfMiddleNode);
		Node sortedListHead=sortedMerge(left,right);
		return sortedListHead;
	}
	Node listRotate(Node head,int k){
		if(k==0) return head;
		Node kThNode=head;
		int count=1;
		
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		while(count<k){
			kThNode=kThNode.next;
			count++;
		}
		last.next=head;
		head=kThNode.next;
		kThNode.next=null;
		return head;
	}
	void printList(Node head){
		Node cur=head;
		while(cur!=null){
			System.out.print(cur.data +"->");
			cur=cur.next;
		}
	}
	public static void main(String[] args) {
		LinkedListSorting obj=new LinkedListSorting();
		Node head=new Node(122);
		obj.append(head,11);
		obj.append(head,1132);
		obj.append(head,211);
		obj.append(head,511);
		obj.append(head,181);
		obj.mergeSort(head);
		obj.printList(head);
		System.out.println("After Rotation");
		head=obj.listRotate(head,2);
		obj.printList(head);
	}
}
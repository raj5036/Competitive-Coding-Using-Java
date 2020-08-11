import java.util.*;
import java.io.*;
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedListReverse{
	Node head;
	Node reverseList(Node head){
		Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
        return head; 
	}
	Node getMiddle(Node head){
		Node fast=head,slow=head;
		while(fast.next!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	Node sortedMerge(Node a,Node b){
		Node result=null;
		if(a==null) return a;
		if(b==null) return b;
		if(a.data<b.data){
			result=a;
			result.next=sortedMerge(a.next,b);
		}else if(a.data>b.data){
			result=b;
			result.next=sortedMerge(a,b.next)
		}
		return result;
	}
	void MergeSort(Node head){
		Node middle=getMiddle(Node head);
		middle.next=nextOfMiddleNode;

		middle.next=null;

		MergeSort(head);
		MergeSort(nextOfMiddleNode);

		
	}
	void appendNode(Node head,int key){
		Node last=head;
		Node new_node=new Node(key);
		while(last.next!=null){
			last=last.next;
		}
		last.next=new_node;
	}
	void printList(Node head){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.print("null");
	}
	public static void main(String[] args) {
		Node head=new Node(12);
		LinkedListReverse obj=new LinkedListReverse();
		obj.appendNode(head,11);
		obj.appendNode(head,10);
		obj.appendNode(head,9);
		obj.appendNode(head,8);
		obj.printList(head);
		System.out.println("\nAfter reversing the list");
		head=obj.reverseList(head);
		obj.printList(head);
		Node middleNode=obj.getMiddle(head);
		System.out.println("Middle Node "+ middleNode.data);
	}
}
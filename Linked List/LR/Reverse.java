import java.util.*;
public class Reverse{
	static class Node{
		int data;
		Node next;
		Node(int x){
			this.data=x;
			this.next=null;
		}
	}
	Node add(Node head,int data){
		if(head==null) return new Node(data);
		Node newNode=new Node(data);
		Node last=head;
		while(last.next!=null)
			last=last.next;
		last.next=newNode;
		return head;
	}
	Node reverseList(Node head){
		Node prev=null;
		Node next=null;
		Node current =head;
		while(current!=null){
			//1->2->3
			next=current.next;
			current.next=prev;

			prev=current;
			current=next;
		}
		head=prev;
		return head;
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
		Reverse obj=new Reverse();
		obj.add(head,2231);
		obj.add(head,4535);
		obj.printList(head);
		System.out.println("\nAfter reversing");
		Node revrsedHead=obj.reverseList(head);
		obj.printList(revrsedHead);
	}
}
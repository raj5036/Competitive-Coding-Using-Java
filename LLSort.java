/*package whatever //do not write package name here */

import java.util.*;


class GFG {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int num){
            this.data = num ;
            this.next = null;
        }
    }
    public void push(int key){
        Node new_node = new Node(key);
        new_node.next = head;
        head=new_node;
    }
    public void append(int key){
        Node new_node = new Node(key);
        if(head==null){
            head=new_node;
        }else{
            Node last = head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=new_node;
        }
    }
    public int search(int key){
        int pos = 0;
        Node current = head;
        while(current!=null){
            pos++;
            if(current.data==key)
                return pos;
            current=current.next;
        }
        return -1;
    }
    public void printList(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
    }
	public static void main (String[] args) {
		int T;
		GFG list = new GFG();
        Scanner sc = new Scanner(System.in);
        System.out.println("No Of TestCases");
		T=sc.nextInt();
		
		for(int i=0;i<T;i++){
            System.out.println("No Of Nodes");
            int noOfNodes=sc.nextInt();
            System.out.println("Data to be searched");
            int searchData = sc.nextInt();
            System.out.println("List Elements :");
		    for(int j=0;j<noOfNodes;j++){
		        int key = sc.nextInt();
		        list.append(key);
            }
            sc.close();
            list.printList();
		    System.out.println("Element Found at "+list.search(searchData));
		}
	}
}
class List1{
   static Node head;
   static class Node{
       int data;
       Node next;
       Node(int num){
           this.data=num;
           this.next=null;
       }
   }
   public int getNthFromLast(Node head, int n)
    {
    	int noOfNodes=0;
    	Node current = head;
    	while(current!=null){
    	    noOfNodes++;
    	    current = current.next;
    	}
    	int countFromBeginning = noOfNodes - n ;
    	Node result = head;
    	for(int i=1;i<=countFromBeginning;i++){
    	    result = result.next;
    	}
    	return result.data;
    }
   public void push(int key){
        Node new_node = new Node(key);
        new_node.next = head;
        head=new_node;
   }
   public int getMiddle(){
       Node slow  = head,fast=head;
       while(fast.next != null && fast.next.next != null){
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow.data;
   }
   public void insertAfter(Node prev_node,int key){
       if(prev_node==null){
           System.out.println("The Previous node can not be null");
           return;
       }
       Node new_node = new Node(key);
       new_node.next = prev_node.next;
       prev_node.next = new_node;
   }
   public void append(int key){
        if(head == null){
            head = new Node(key);
            return;
        }
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        Node new_node = new Node(key);
        last.next = new_node;
   }
   public void searchNode(int key){
       Node current  = head;
       while(current!=null){
           if(current.data==key){
               System.out.println("\nexists");
               return;
           }
           current = current.next;
           if(current==null){
               System.out.println("\nDoesn't exist");
               return;
           }
       }
   }
   public static void main(String[] args) {
       List1 list = new List1();
       list.push(23);
       list.push(21);
       list.push(785);
       
       list.push(122);
       list.append(54);
       list.insertAfter(head.next.next, 24);

       Node current = head;
       while(current!=null){
           System.out.print(current.data+"->");
           current=current.next;
       }
       System.out.println("null");
       list.searchNode(4567);
       System.out.println("Middle Element: "+list.getMiddle());
       System.out.println(list.getNthFromLast(head, 3));
   }
}
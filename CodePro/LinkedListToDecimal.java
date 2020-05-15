class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    public static Node push(Node head,int key){
        Node new_node = new Node(key);
        new_node.next=head;
        head=new_node;
        return head;
    }
    public static Node append(Node head,int key){
        Node last = head;
        while(last.next!=null){
            last=last.next;
        }
        Node node = new Node(key);
        last.next=node;
        return head;
    }
    public static void printList(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
    }
    public static int convertToDecimal(int n){
        // int real=n,decimal=0,i=0,digit;
        // do{
        //     digit=n%10;
        //     decimal += digit*Math.pow(2,i);
        //     i++;
        //     n=n/10;
        // }while(n!=0);
        //return decimal;
        String s = Integer.toString(n);
        return Integer.parseInt(s,2);
    }
    public static int extractBinaryCode(Node head){
        Node current=head;
        int length=0,BinaryCode=0;
        while(current!=null){
            length++;
            current=current.next;
        }
        current=head;
        while(current!=null){
            BinaryCode += current.data * Math.pow(10,length-1);
            current=current.next;
            length--;
        }
        return BinaryCode;
    }
    
    
    public static void main(String[] args){
        Node head=new Node(0);
        head=push(head, 1);
        append(head, 1);
        printList(head);
        int code=extractBinaryCode(head);
        System.out.println(convertToDecimal(code));
    }
}
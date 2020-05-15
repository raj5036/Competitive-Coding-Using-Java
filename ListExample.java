
class ListExample{
    Node head=null;
    static class Node{
        int data;
        Node next;
        Node(int num){
            data=num;
            next=null;
        }
    }

    public static void main(String[] args) {
        ListExample list = new ListExample();
        list.head=new Node(2);
        Node first = new Node(12);
        Node sec = new Node(54);
        list.head.next=first;
        first.next = sec;
        
        Node current = list.head;
        int size=0;
        while(current!=null){
            System.out.println(current.data);
            size++;
            current=current.next;
        }
        int iterate=0;
        while(current!=null){
            current=current.next;
            iterate++;
            if(iterate==Math.round(size/2)){
                System.out.println(current.data);
                break;
            }
        }
    }
}
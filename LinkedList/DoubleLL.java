public class DoubleLL {
    public static void main(String[] args) 
    {
        System.out.println("jai shree ram!");
        System.out.println(size);
        DoubleLL ll=new DoubleLL();
        ll.addFirst(12);
        ll.addFirst(14);
        ll.addFirst(16);
        ll.addFirst(18);
        System.out.println(size);

    }
    static class Node {
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;

        }

    }

    public static Node head;
    public static Node tail;
    public static  int  size=0;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.next=newNode;
        head=newNode;
    }
    //print ke liye
    
}

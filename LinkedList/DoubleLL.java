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
        ll.printLL(head);
       // System.out.println(ll.removeFirst());
        ll.reverseLL();
        ll.printLL(head);

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
        head.prev=newNode;
        head=newNode;
    }
    //print ke liye
    public void printLL(Node head){
        Node temp=head;
        System.out.print("null<-");
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //remove element
    public int removeFirst(){
        int val;
        if(head==null){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            val=head.data;
            size--;
            head=tail=null;
            return val;
            
        }
        val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    //reverse  the linked list 
    void reverseLL(){
        Node curr=head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }
}



class singleLL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    private static  Node head;
    private static  Node tail;
    private static int size=0;
    void printLL(){
        Node temp=head;
        if(size==0){
            System.out.println("sorry LL is empty");
            return;
        }
        while(temp!=null){
            System.out.print( temp.data+"->");
            temp=temp.next;
        }System.out.println("null");



    }
    void addFirst(int data){
        Node n= new Node(data);
        size++;
        if(head==null){
            head=tail=n;
            return ;
                }
        n.next=head;
        head=n;
        


    }
    //for adding from the last 
    void addLast(int data){
        Node n=new Node(data);
        size++;
        if( head==null){
            head=tail=n;
            return;
        }
         tail.next=n;
         tail=n;

    }

    int delF
    public static void main(String[] args) {
        singleLL ll=new singleLL();
        System.out.println(size);
        ll.addFirst(345);
        System.out.println(size);
        ll.printLL();

    }
}
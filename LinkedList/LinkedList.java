import java.util.*;

public class LinkedList{
   public static class  Node {
   
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
   }

   public static Node head;
   public static Node tail;
   public static int size;

   public void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;

        }
        newnode.next=head;
        head=newnode;
   }
   public void addLast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;

   }
   public void PrintLL(Node head){
            if(size==0){
                System.out.println("there is no element in linkedlist");
                return;
            }
            Node temp=head;

            while (head!=null) {
                System.out.print(head.data+"->");
                head=head.next;
            }
            System.out.println("null");
   }
   public void addAt(int data,int idx){
        if(idx>size || idx<0){
            System.out.println("enter the correct index");
            return;
        }
        Node newnode=new Node(data);
        size++;
        if( idx==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        while ((i<idx-1)) {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next; 
        temp.next=newnode;
      
   }

   public void removeFirst(){
       int temp=head.data;
        if(size==0){
            System.out.println("sorry linked list is empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size=0;
            System.out.println("removed element is "+temp);
            return;

        }

        head=head.next;
        size--;
        System.out.println("removed element is "+temp);
   }

   public void removeLast(){
        int val;
        if(size==0){
            System.out.println("linked list is empty");
            return;
        }
        if(size==1){
            val=head.data;
            head=tail=null;
            size=0;
            System.out.println("deleted element is "+val);
        }

        Node prev=head;
        int i=0;
        while (i<size-2) {
            prev=prev.next;
            i++;
        }
        val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        System.out.println("deleted element is "+val);
   }

   public int search(int key){
            Node temp=head;
            int i=0;
            while (temp!=null) {
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
   }
   public int helper(Node head , int key){
         if(head==null){
            return -1;
         }
         if(head.data==key){
            return 0;
         }
         int idx=helper(head.next,key);
         if(idx==-1){
            return -1;
         }
         else{
            return idx+1;

         }
   }
   public int recSearch(int key){
        return helper(head,key);

   }

   public void reverse(){
        Node curr=tail=head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
   }

   public void recRev(Node head){
        if(head!=null){
            recRev(head.next);
            System.out.print(head.data+"-> ");
        }
   }


   public void deleteNthFromEnd(int n){
        int sz=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int iTofind=sz-n;
        Node prev=head;
        while (i<iTofind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
   }

   public Node findMid(Node head){
            Node slow=head;
            Node fast=head;

            while (fast!= null && fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;

            }
            return slow;
   }


   public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }

        Node mid=findMid(head);

        Node prev=null;
        Node next;
        Node curr=mid;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right =prev;
        Node left =head;
        while (right!=null) {
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
   }



   public boolean isCyclic(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
   }

   public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        Node prev=null;
        boolean isCycle=false;

        while (fast!=null && fast.next!= null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isCycle=true;
                break;
            }
        }
        if(!isCycle){
            return;
        }
        slow=head;
        while (slow!=fast) {
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        prev.next=null;
   }
   //get mid function 
   private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
   }
   private Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;

            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;

            }
        }
        while (head1!=null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while (head2!=null) {
            temp.next=head1;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
   }

   //merge sort on the linked list 
   public Node mergeSort(Node head){
    //base case
        if(head==null || head.next==null){
            return head;
        }
        //find mid 
        Node mid=getMid(head);

        Node rightHead=mid.next;
        mid.next=null;
    
        //merge sort on right
        Node newLeft=mergeSort(head);
        //merge left and right
        Node newRight=mergeSort(rightHead);
        //merge
        return merge(newLeft,newRight);
        
   }


   //to merge the linked list in the  zig-zag fashion
   public void zigzag(){
        //find mid 
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }

        Node mid =slow;
        Node curr=mid.next; 
        mid.next=null;
        //reverse the right half 
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            //updation 
            left=nextL;
            right=nextR;

        }

   }

   public static void main(String[] args) {
        LinkedList list=new LinkedList();
    //     list.addFirst(1);
    //     list.addFirst(2);
    //     list.addFirst(3);
    //     list.addFirst(4);
    //     list.addLast(5);
    //     list.addLast(6);
    //     list.addLast(7);
    //     list.addAt(10,4);
    //     list.removeFirst();
    //     list.removeLast();
    //     System.out.println(size);
    //     System.out.println(list.search(10));
    //     System.out.println(list.recSearch(10));
    //     list.PrintLL(head);
    //   //  list.reverse();
    //   list.recRev(head);

    //     list.PrintLL(head);


    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addFirst(4);
    //System.out.println(list.isPalindrome());
    // list.PrintLL(head);
    // list.head=list.mergeSort(list.head);
    // list.PrintLL(head);

    // head=new Node(12);
    // head.next=new Node(23);
    // head.next.next=new Node(34);
    // head.next.next.next=head.next;

    // System.out.println(list.isCyclic());
    // removeCycle();
    // System.out.println(list.isCyclic());

    list.PrintLL(head);
    list.zigzag();
    list.PrintLL(head);
   }
}
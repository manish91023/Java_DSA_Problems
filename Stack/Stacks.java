import java.util.ArrayList;
import java.util.LinkedList;

class Stacks{
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(45);
        s.push(445);
        s.push(55);
        System.out.println(s.pop());
       System.out.println(s.isEmpty());
       System.out.println(s.peek());
    }
     
    //stack with linkedlist
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static class Stack {
        public static Node head=null;
        public boolean isEmpty(){
            return head==null;
        }
        public void push(int data){
            Node newNode=new Node(data);
            if(head==null){
               head=newNode;
               return;
            }
            newNode.next=head;
            head=newNode;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int data=head.data;
            head=head.next;
            return data;
        }
        public int peek(){
            if(isEmpty()) return -1;
            return head.data;
        }
    }
    //stack with array list 
    // public static class Stack{
    //     ArrayList<Integer>list=new ArrayList<>();
    //     public boolean isEmpty(){
    //         return list.size()==0;
    //     }

    //     //push
    //     public void push(int data){
    //         list.add(data);
    //     }
    //     //pop
    //     public int pop(){
    //         if(list.isEmpty()){
    //             return -1;
    //         }
    //         int data=list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return data;
    //     }
    //     public int peek(){
    //         return list.get(list.size()-1);
    //     }

    //     public void print(){
    //         while (!list.isEmpty()) {
    //             System.out.println(list.get(list.size()-1));
    //             list.remove(list.size()-1);
    //         }
    //     }

    //}
}
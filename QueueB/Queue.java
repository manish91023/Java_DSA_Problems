

public class Queue {
    static class queue{
        static int arr[];
        static int size;
        static int rear;

        queue(int n){
            size=n;
            arr=new int[n];
            rear=-1;
        }
        //isEmpty
        boolean isEmpty(){
            return rear==-1;
        }
        // add
        void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        //remove
        int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;

            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];

            }
            rear--;
            return front;
        }

        //peek
        int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }
}

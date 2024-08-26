

public class Circular {
    static class circularQ{
        static int arr[];
        static int rear;
        static int front;
        static int size;

        circularQ(int n){
            size=n;
            arr=new int[size];
            rear=-1;
            front=-1;

        }
        // is empty
        boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        // id full 
        boolean isFull(){
            return (rear+1)%size==front;
        }
        //add 
        void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //remove
        int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int rele=arr[front];
            if(front==rear){
                rear=front=-1;
            }else{
                 front=(front+1)%size;
            
            }
            return rele;
        }

        // peek
        int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        circularQ q=new circularQ(3);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(0);
        q.remove();
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

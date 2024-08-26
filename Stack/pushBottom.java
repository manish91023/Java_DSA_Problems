import java.util.Stack;

public class pushBottom {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);  
        s.push(3);  
        System.out.println(s);
       RevereseStack(s);
        System.out.println(s);
    }
    public static void pushAtBottom(Stack<Integer> s,int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(s, data);
            s.push(top);
    }

    public static void RevereseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return ;
        }
        int top=s.pop();
        RevereseStack(s);
        pushAtBottom(s,top);
    }
}

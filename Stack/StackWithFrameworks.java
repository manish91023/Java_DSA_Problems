import java.util.Stack;

public class StackWithFrameworks {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(45);
        s.push(445);
        s.push(75);
        s.push(965);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
    }
}

package Stack;
import java.util.*;
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(23);
        stack.push(24);
        stack.push(25);

        System.out.println(stack);
        RevereseStack(stack);
        System.out.println(stack);
    }
  
}

package Stack;

import java.util.Stack;

public class ReverseElem {
    public static void main(String[] args) {
      
    }
    public static void removeStr(String s){
        Stack<Character>stack=new Stack<>();
        int idx=0;
        while (idx<s.length()) {
            stack.push(s.charAt(idx));
            idx++;
        }
        String newString="";
        while (!stack.isEmpty()) {
            newString+=stack.pop();
        }
        System.out.println(newString);
    }
   
}

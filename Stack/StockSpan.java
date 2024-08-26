import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);
        for(int i=0 ;i < span.length;i++){
            System.out.println(span[i]);
        }
    }
    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> st=new Stack<>();
        span[0]=1;
        st.push(0);

        for(int i=1;i<stocks.length;i++){
            int currPrice=stocks[i];
            while (!st.isEmpty() && currPrice>stocks[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();  
            }
        }
    }
}

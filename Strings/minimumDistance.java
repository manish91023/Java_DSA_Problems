import java.util.*;
import java.math.*;
public class minimumDistance {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("the");
        s.add("quick");
        s.add("brown");
        s.add("fox");
        s.add("quick");

        System.out.println(minimumDistance(s, "the", "fox"));
    }
    static int minimumDistance(ArrayList<String> str,String w1,String w2){

        int d1=-1;
        int d2=-1;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<str.size();i++){
            if(str.get(i)==w1){
                d1=i;
            }
            if(str.get(i)==w2){
                d2=i;
            }
            if (d1 != -1 && d2 != -1){

                res = Math.min(res,Math.abs(d1-d2));
            }
        }
        System.out.println(d1+" "+d2);
      
        return res;
    }
}

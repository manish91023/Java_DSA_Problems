import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("IVVIX"));
    }
    static int  romanToInt(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int output=0;
        for(int i=0;i<n;i++){
            if(i<n-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                output+=map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i++;
            }else{
                output+=map.get(s.charAt(i));
            }
        }
        return output;
    }
}

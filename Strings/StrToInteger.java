public class StrToInteger {
    public static void main(String[] args) {
        System.out.println(StringToInteger("1258"));
    }
    static int StringToInteger(String s){
        s=s.trim();
        int i=0;
        int res=0;
        while (i<s.length()) {
            char ch=s.charAt(i);
            int digit = ch-48;
            if(digit<0 || digit>9){
                break;
            }
            res=res*10+ch;
            i++;

        }
        return res;
    }
}

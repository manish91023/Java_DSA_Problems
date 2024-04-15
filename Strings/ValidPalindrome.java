public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isValidPalindrome("race ,  car"));
    }
    static boolean isValidPalindrome(String s) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                Character.toLowerCase(ch);
                sb.append(ch);
            }
        }
        for(int st=0,end=sb.length()-1;st<end;) {
            if(sb.charAt(st)!=sb.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
       
        return true;

    }
}

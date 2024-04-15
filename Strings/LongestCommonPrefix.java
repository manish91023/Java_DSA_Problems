import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String s[]={"flower","flow","floight"};
        System.out.println(LongestCommonPrefix(s));
    }
    static String LongestCommonPrefix(String s[]){
        Arrays.sort(s);
        char chF[]=s[0].toCharArray();
        char chL[]=s[s.length-1].toCharArray();
        String res="";

        for(int i=0;i<chF.length;i++){
            if(chF[i]!=chL[i]){
                break;
            }
            res+=chF[i];

        }
        if(res.isEmpty()){
            return "-1";
        }
        return res;
    }
}

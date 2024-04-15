public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println(isPermutation("abc", "abc"));
    }
    static boolean isPermutation(String str1, String str2){ 
        if(str1.length()!=str2.length()){
            return false;
        }
        int res[]=new int[256];  
        char ch;
        for(int i=0;i<str1.length();i++){
            ch=str1.charAt(i);
            res[ch]++;
            ch=str2.charAt(i);
            res[ch]--;
        }
        for(int i=0;i<res.length;i++){
            if(res[i]!=0){
               return false;
            }
        }
        return true;
            

    }
}

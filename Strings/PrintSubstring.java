public class PrintSubstring {
    public static void main(String[] args) {
        PrintSubstring("abc");
    }
    static void PrintSubstring(String str){
        int n = str.length();
       for(int i=0;i<n;i++){
        for(int j=i;j<n;j++) {
            System.out.println(str.substring(i, j+1));
        }
        
       }
    }
}

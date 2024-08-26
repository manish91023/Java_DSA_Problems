public class Main {
    public static void main(String[] args) {
       System.out.println( reversed("welcome to geeksforgeeks"));
    }
    static String  reversed(String str){
        String rev[]=str.split(" ");

        StringBuilder sb=new StringBuilder();
        for(int i=rev.length-1;i>=0;i--){
            sb.append(rev[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}

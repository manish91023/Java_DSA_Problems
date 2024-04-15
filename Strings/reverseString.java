public class reverseString {
    public static void main(String[] args) {
        System.out.println(ReverseWord("i.like.this.match"));
    }
    static String ReverseWord(String s){
        String temp[]= s.split("\\.");
        for(String ss:temp){
            System.out.print(ss+" ");
        }
        System.out.println();
        StringBuffer sb=new StringBuffer();

        for(int i=temp.length-1;i>=0;i--){
            sb.append(temp[i]);
            if(i!=0){
                sb.append('.');
            }
            
        }
        return sb.toString();
    }

}

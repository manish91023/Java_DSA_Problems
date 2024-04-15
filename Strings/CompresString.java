class CompresString{
    public static void main(String[] args) {
        printCompressedString("abbbcdbbddd");
    }
    static void  printCompressedString(String str){
        int i=0;
        StringBuffer sb=new StringBuffer();
        while (i<str.length()) {
            char ch=str.charAt(i);
            int count =0;
            while (i<str.length()) {
                if(ch==str.charAt(i)){
                    count++;
                    i++;
                }else{
                    break;
                }
            }
            sb.append(ch);
            if(count>1){
                sb.append(count);
            }
            
        }
        System.out.println(sb);
    }
}
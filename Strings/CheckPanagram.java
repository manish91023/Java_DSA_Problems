public class CheckPanagram {
    public static void main(String[] args) {
        System.out.println(CheckPanagram("bawds jog , flick quartz , vex ,nymph"));
    }
    static boolean CheckPanagram(String str){
        boolean res[]=new boolean[26];
        

        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                ch=Character.toUpperCase(ch);
                int index=ch-'A';
                res[index]=true;
            }
        }
        for(boolean x:res){
            if(x==false){
                return false;
            }
        }
        return true;
    }
}

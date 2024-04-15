public class FinalValueAfterOptn {
    public static void main(String[] args) {
        String str[]={"x++","++x", "--x + --x"};
        System.out.println(FinalValueAfterOptn(str)); 
    }
    static int FinalValueAfterOptn(String arr[]){
        int x=0;
        for(String s:arr){
            switch (s) {
                case "++x": case "x++":
                    x++;
                    break;
            
                default:
                x--;
                    break;
            }
        }
        return x;
    }
}

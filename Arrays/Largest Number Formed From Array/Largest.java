import java.util.Arrays;

public class Largest {
    public static void main(String[] args) {
        Integer arr[]={3,30,34,5,9};
        System.out.println(LargestNumber(arr));
    }
    static String LargestNumber(Integer arr[]){
        Arrays.sort(arr,(a,b)->{
            String aStr= String.valueOf(a);
            String bStr = String.valueOf(b);
            return (bStr+aStr).compareTo(aStr+bStr);
        });

        StringBuilder sb = new StringBuilder();
        for(Integer num:arr){
            sb.append(num);
        }
        return sb.toString();
    }
}

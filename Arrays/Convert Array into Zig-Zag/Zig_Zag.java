import java.util.Arrays;

public class Zig_Zag {
    public static void main(String[] args) {
        int arr[]={4,3,7,8,6,2,1};
        ConvertZigZag(arr, 7);
    }

     static void ConvertZigZag(int arr[],int n){
        for(int i = 1; i<n-1; i+=2){
            int temp;
            if(arr[i]<arr[i+1]){
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }else if(arr[i]<arr[i-1]){
                temp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
     }
}

import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] args) {
        int arr1[]={1,2,5,4,0};
        int arr2[]={2,4,5,0,1};
        System.out.println( ArrayEqual(arr1, arr2, 5));
    }

    static boolean ArrayEqual(int arr1[],int arr2[],int n){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0;i < n;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}

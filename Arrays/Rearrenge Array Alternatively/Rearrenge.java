import java.util.Arrays;

public class Rearrenge {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        RearrengeAlternativaly(arr, 6);
    }

    static void RearrengeAlternativaly(int arr[],int size){
        int temp[]= new int[size];
        int small=0;
        int large = size-1;
        int i=-1;
        while (small<large) {
            temp[++i]=arr[large];
            large--;
            temp[++i]=arr[small];
            small++;
        }
        System.out.println(Arrays.toString(temp));
    
    }
}

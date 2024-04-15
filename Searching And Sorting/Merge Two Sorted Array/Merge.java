import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int arr[]={1,3,4,5};
        int arr1[]={2,4,6,8};
        MergeSortTwoArr(arr,4,arr1,4);
    }

    static void MergeSortTwoArr(int arr[],int m,int arr1[],int n){
        int temp[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while (i<m && j<n) {
            if(arr[i]<arr1[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr1[j];
                j++;
            }
            k++;
        }
        //remaning element in one array
        while (i<m) {
            temp[k]=arr[i];
            i++;k++;
        }
        //remaining in 2nd array
        while (j<n) {
            temp[k]=arr1[j];
            j++;k++;
        }

        System.out.println(Arrays.toString(temp));
        
    }
}

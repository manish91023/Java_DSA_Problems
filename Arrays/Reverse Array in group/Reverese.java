
public class Reverese {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        RevereseGroupArr(arr, 9, 3);
        PrintArray(arr);

    }
   static void PrintArray(int arr[]){
        for(int i =0 ;i< arr.length;i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void RevereseGroupArr(int arr[],int n,int k){
        for(int i= 0 ; i<n;i+=k){
            int left = i;
            int right = Math.min(i+k-1, n-1);//to solve the when element is odd
            int temp;

            while (left < right) {
                temp = arr[left];

                arr[left] = arr[right];

                arr[right]= temp;

                left++;
                right--;
                
            }
        }
    }
}



public class Equlliburium {
   public static void main(String[] args) {
    int arr[]={2,4,7,2,4,7,0,1,1};
    System.out.println(EqulliburiumPoint(arr, 9));
   } 


   static int  EqulliburiumPoint(int arr[],int n){
    for(int i=1; i < n; i++){
        int j=i; int k = i;
        int sumL=0;
        int sumR = 0; 

        while (j>=0) {
            sumL+=arr[j];
            j--;
        }

        while (k<n) {
            sumR += arr[k];
            k++;
            
        }
        if(sumL==sumR){
            System.out.println("equlliburium point is at index "+i);
            return arr[i];
        }
    }
    return -1;
   }
}

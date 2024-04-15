
public class QuickSort {
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        QuickSort(arr,0 , 5); 
        print(arr);
    }
                        

    static void QuickSort(int arr[],int low,int high){
        if(low<high){
            int idx= partition(arr, low, high);

            QuickSort(arr,low,idx-1);
            QuickSort(arr,idx+1,high);
        }
    }
    static void print (int arr[]){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap 
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[high]=temp;

        return i; //pivot index 

    }
}

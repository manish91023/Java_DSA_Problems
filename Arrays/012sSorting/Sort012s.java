
public class Sort012s {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2};
        Sort012s(arr, 6);
        PrintArr(arr);
    }


    static void PrintArr(int arr[]){
        for(int i= 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
    static void Sort012s(int arr[],int size){
        int low=0;
        int high= size-1;
        int mid = 0;
        int temp=0;
        while(mid<=high){
            if(arr[mid]== 0){
                temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;

                low++;
                mid++;
                
            }else if (arr[mid]==1) {
                mid++;
            }else{
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}

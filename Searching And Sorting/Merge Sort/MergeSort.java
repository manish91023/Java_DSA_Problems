
public class MergeSort {
    
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        MergeSort(arr,0,arr.length-1);
        PrintArr(arr);
    }

    static void MergeSort(int arr[],int si,int ei){
        
        if(si>=ei){
            return;
        }
        int mid=si + (ei-si)/2;
        MergeSort(arr,si,mid);
        MergeSort(arr, mid+1, ei);
        Merge(arr,si,mid,ei);
    }

    static void Merge(int arr[],int si,int mid ,int ei){
            int temp[] = new int[ei-si+1];//temp array
            int  i= si;//itarator for left part
            int j= mid+1;//iterator for right part 
            int k=0; //itarator for temp array

            while (i<=mid && j<=ei) {
                if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    i++;
                }else{
                    temp[k]=arr[j];
                    j++;
                }
                k++;
            }

            //remaining element in left array;
            while (i<=mid) {
                temp[k++]=arr[i++];
            }

            //remaining element in right arrray
            while (j<=ei) {
                temp[k++]=arr[j++];
            }

            //copy the temp array in original arrray
            for( k=0 , i=si;k<temp.length;k++,i++){
                arr[i]=temp[k];
            }
    }

    //print array
        static void PrintArr(int arr[]){
            System.out.print("[ ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println("]");
        }
}

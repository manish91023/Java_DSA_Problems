

class BinarySearch{
    public static void main(String[] args) {
       int arr[]={2,5,8,12,16,23,38,56,72,91};
       int r =   BinarySearch(arr, 23);
       if(r==-1){
        System.out.println("element is not found in given array");
       }else{
        System.out.println("element is found at position "+r);
       }
      
    }

    static int BinarySearch(int arr[],int x){
        int l=0;
        int r=arr.length-1;

        while (l<=r) {
            int m = l+(r-l)/2;
            if(arr[m]== x){
                return m;
            }
             if(arr[m]<x){
                    l = m+1;

            }else{
                r=m -1;
                
            }
        }
        return -1;
    }
}
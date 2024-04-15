
public class Inversion {
    public static void main(String[] args) {
        int arr[]={8,4,2,1};
        System.out.println(mergeSort(arr,0,arr.length-1));
    }
    static int mergeSort(int arr[],int l,int h){
        int inversion=0;
        
        if (l < h) {
            int mid = l + (h - l) / 2;
    
            // Divide
            inversion += mergeSort(arr, l, mid);
            inversion += mergeSort(arr, mid + 1, h);
    
            // Merge and count inversions
            inversion += Merge(arr, l, mid, h);
        }
        return inversion;
    }
    static int Merge(int arr[],int l,int m,int h){
        int temp[]=new int[h-l+1];
        int swap=0;
        int i=l; // Start from the left index
        int j=m+1;
        int k=0;

        while (i<=m && j<= h) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
                swap += m - i + 1; // Correctly count the inversions
            }
            k++;
        }

        // Correctly handle the remaining elements in the left half
        while (i<=m) {
            temp[k]=arr[i];
            k++;i++;
        }
        // Correctly handle the remaining elements in the right half
        while (j<=h) {
            temp[k]=arr[j];
            k++;j++;
        }
        for( k=0 , i=l;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

        return swap;
    }
    }
    


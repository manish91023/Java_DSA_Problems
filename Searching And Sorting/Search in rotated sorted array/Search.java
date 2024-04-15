
public class Search {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(searchRotated(arr, 0, 0, arr.length-1));
    }

    static int searchRotated(int arr[],int key,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;

        if(arr[mid]==key){
            return mid;
        }

        //case 1 L1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=key && key<=arr[mid]){
                return searchRotated(arr, key, si, mid);
            }else{
                return searchRotated(arr, key, mid+1, ei);
            }
        }

        //case 2 l2 

        else{
            //right part 
            if(arr[mid]<=key && key<=ei){
                return searchRotated(arr, key, mid+1, ei);

            }else{
                return searchRotated(arr, key, si, mid-1);
            }
        }
    }
}

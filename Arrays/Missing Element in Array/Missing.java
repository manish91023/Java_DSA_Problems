
public class Missing {
    public static void main(String[] args) {
        int arr[]={};
        MissingElem(arr, 7);

    }
    static void MissingElem(int arr[],int n){
        int size = n+1;
        int totalSum = (size*(size+1))/2;
        int arraySum=0;
        
        for(int num: arr){
            arraySum += num;
        }
        System.out.println("missing is "+(totalSum-arraySum));


    }
}

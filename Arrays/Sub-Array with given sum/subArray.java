
class subArray{
    public static void main(String[] args) {
        System.out.println("manishf kumar");
        int arr[]={1,4,20,3,10,5};
        subArray(arr, 3);
    }

    static void subArray(int arr[],int Sum){
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum=arr[i];
            if(currSum==Sum){
                System.out.println("sum is found at position "+i);
                return;
            }else{
                for(int j=i+1;j<arr.length;j++){
                    currSum+=arr[j];
                    if(currSum==Sum){
                        System.out.println("sum found between "+i +" and "+j);
                        break;
                    }
                }
            }
        }
    }
}
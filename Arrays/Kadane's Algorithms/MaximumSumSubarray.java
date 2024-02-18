
public class MaximumSumSubarray {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        MaximumSumSubarray(arr,8);

    }

    static void MaximumSumSubarray(int arr[],int n){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i = 0 ; i< n ; i++){
            currSum+=arr[i];
            if(maxSum<currSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println("maximum sum is "+maxSum);
    }
}

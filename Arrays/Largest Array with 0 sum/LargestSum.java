
public class LargestSum {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        System.out.println(LargestSubArrSumZero(arr, 0));
    }

    static int LargestSubArrSumZero(int arr[],int sum){
        int maxLen = 0;
        for(int i = 0; i < arr.length ; i++){
            int currSum=0;
            for(int j = i; j < arr.length;j++){
                currSum += arr[j];
                if(currSum==sum){
                    maxLen=Math.max(maxLen, j-i+1);
                }
            }
        }

        return maxLen;
    }
}

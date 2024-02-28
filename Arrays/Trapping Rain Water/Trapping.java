

public class Trapping {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        TrappingWater(arr, 7);
    }
    static void TrappingWater(int height[],int n){
        //calculate left max boundry
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1], height[i]);
        }

        //claculate right max boundry
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i] =Math.max(rightMax[i+1], height[i]);
        }

        int trappedWater=0;

        //loop 
        for(int i=0;i<n;i++){
            //calculate water lavel
            int waterLevel=Math.min(leftMax[i], rightMax[i]);

            //traped water 
            trappedWater+=(waterLevel-height[i]);
        }
        System.out.println("trapped water is "+trappedWater);
    }
}

import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int arr[]={900,940,950,1100,1500,1800};
        int dep[]={910,1200,1120,1130,1900,2000};
        System.out.println(MinimumPlatforms(arr, dep));
    }

   static int MinimumPlatforms(int arr[],int dep[]){
    //sort the arrays 
    Arrays.sort(dep);
    Arrays.sort(arr);
    
    int i=0;
    int j=0;
    int platformNeeded=0;
    int maxPlatform = 0;
    while (i< arr.length && j<dep.length) {
        if(arr[i]<= dep[j]){
            platformNeeded++;
            i++;
        }else{
            platformNeeded--;
            j++;
        }
        maxPlatform=Math.max(platformNeeded, maxPlatform);

    }
    return maxPlatform;
   }
}
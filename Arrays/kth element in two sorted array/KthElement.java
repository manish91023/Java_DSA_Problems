import java.util.ArrayList;

public class KthElement {
    public static void main(String[] args) {
        int arr1[]={2,3,6,7,9};
        int arr2[]={1,4,8,10};
        int k=5;
        KthElementTwoSorted(arr1, arr2, 5, 4, 5);
    }

    static void KthElementTwoSorted(int arr1[],int arr2[],int m,int n,int k){
        int i= 0;
        int j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i<m && j<n) {
            if(arr1[i]<=arr2[j]){
                ans.add(arr1[i]);
                i++;
            }else{
                ans.add(arr2[j]);
                j++;
            }
        }

        while (i<m) {
            ans.add(arr1[i]);
            i++;
        }

        while (j<n) {
            ans.add(arr2[j]);
            j++;
        }
        System.out.println("the kth element is "+ans.get(k-1));
    }
}

package Arrays.Medium;

import java.util.HashMap;

public class TwoSumBetterApproach
{
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
    public static String twoSum(int n, int[] arr, int target){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0;i<n;i++){
            int moreNeeded = target-arr[i];
            if(mpp.containsKey(moreNeeded)){
                return "True";
            }
            mpp.put(arr[i],i);
        }
        return "False";
    }
}

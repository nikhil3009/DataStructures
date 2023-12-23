package Arrays.Medium;

import java.util.Arrays;

public class TwoSumOptimal {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant optimal: " + ans);
    }
    public static String twoSum(int n, int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return "True";
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return "False";
    }
}

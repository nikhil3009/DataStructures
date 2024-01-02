package LeetCode_CodeNinjas;

public class MaxSubArraySum {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for(int i = 0; i<n;i++){
            sum+=nums[i];
            if(sum<0){
                start = i;
                sum = 0;
            }
            if(sum>maxi){
                ansStart = start;
                ansEnd = i;
                maxi = sum;
            }
        }
        return maxi;
    }
}

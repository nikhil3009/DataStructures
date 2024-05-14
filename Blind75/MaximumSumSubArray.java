package Blind75;

public class MaximumSumSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0; i<n;i++){
            sum+=nums[i];
            if(sum<0){
                sum = 0;
            }
            if(sum>maxi){
                maxi = sum;
            }
        }
        return maxi;
    }
}

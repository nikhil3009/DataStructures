package Blind75;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int max = 1;

        for(int i=n-1;i>=0;i--){
            for(int j =i;j<n;j++){
                if(nums[i]<nums[j]){
                    dp[i] = Math.max(dp[i],1+dp[j]);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;

    }
}

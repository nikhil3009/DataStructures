package DynamicProgramming;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            sum+=nums[i];
        }
        if (sum < target || (sum + target) % 2 != 0) {
            return 0;
        }
        int d = (target+sum)/2;
        Integer[][] memo = new Integer[n+1][sum+1];
        return subsetSum(nums,n,d,memo);
    }
    public int subsetSum(int[] arr, int n, int sum, Integer[][] memo) {
        if (sum == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        if (memo[n][sum] != null) {
            return memo[n][sum];
        }
        if (arr[n-1] <= sum) {
            memo[n][sum] = subsetSum(arr, n-1, sum - arr[n-1], memo) + subsetSum(arr, n-1, sum, memo);
        } else {
            memo[n][sum] = subsetSum(arr, n-1, sum, memo);
        }
        return memo[n][sum];
    }
}

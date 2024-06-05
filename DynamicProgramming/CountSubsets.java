package DynamicProgramming;

public class CountSubsets {
    public int countSubsetSums(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for(int i = 0; i<n;i++){
            sum += nums[i];
        }

        if(sum %2 != 0){
            return false;
        }
        int target = (int)(sum/2);
        Integer[][] memo = new Integer[n+1][target+1];
        return subsetSum(nums,n,target,memo);

    }
    public boolean subsetSum(int[] nums, int n, int sum, Integer[][] memo){
        if(sum == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if(memo[n][sum] != null){
            return memo[n][sum];
        }
        if(nums[n-1] <= sum){
            memo[n][sum] = subsetSum(nums,n-1,sum-nums[n-1],memo) + subsetSum(nums,n-1,sum,memo);
        }
        else{
            memo[n][sum] = subsetSum(nums,n-1,sum,memo);
        }
        return memo[n][sum];
    }
}

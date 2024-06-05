package DynamicProgramming;

public class PartitionswithGivenDifference {
    public static int countPartitions(int n, int d, int[] arr) {
        int sum = 0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
        }

        int target = (d+sum)/2;
        Integer[][] memo = new Integer[n+1][sum+1];
        return subsetSum(arr,n,target,memo);

    }
    public static int subsetSum(int[] arr, int n, int sum, Integer[][] memo) {
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

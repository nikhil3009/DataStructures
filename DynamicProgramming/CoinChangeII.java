package DynamicProgramming;

public class CoinChangeII {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        Integer[][] memo = new Integer[n + 1][amount + 1];
        return subsetSum(coins, n, amount, memo);
    }
    private int subsetSum(int[] arr, int n, int sum, Integer[][] memo) {
        if (sum == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        if (memo[n][sum] != null) {
            return memo[n][sum];
        }
        if (arr[n - 1] > sum) {
            memo[n][sum] = subsetSum(arr, n - 1, sum, memo);
        } else {
            memo[n][sum] = subsetSum(arr, n, sum - arr[n - 1], memo) + subsetSum(arr, n - 1, sum, memo);
        }

        return memo[n][sum];
    }
}

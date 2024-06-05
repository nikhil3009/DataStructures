package DynamicProgramming;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        Integer[][] memo = new Integer[n + 1][amount + 1];
        for (int i = 0; i <= n; i++) {
            memo[i][0] = 0;
        }
        for (int j = 1; j <= amount; j++) {
            memo[0][j] = Integer.MAX_VALUE - 1;
        }
        for (int j = 1; j <= amount; j++) {
            if (j%coins[0] == 0) {
                memo[1][j] = j/coins[0];
            } else {
                memo[1][j] = Integer.MAX_VALUE - 1;
            }
        }
        int result = subsetSum(coins, n, amount, memo);
        return result == Integer.MAX_VALUE - 1 ? -1 : result;
    }

    private int subsetSum(int[] arr, int n, int sum, Integer[][] memo) {
        if (sum == 0) {
            return 0;
        }
        if (n == 0) {
            return Integer.MAX_VALUE - 1;
        }
        if (memo[n][sum] != null) {
            return memo[n][sum];
        }
        if (arr[n - 1] > sum) {
            memo[n][sum] = subsetSum(arr, n - 1, sum, memo);
        } else {
            memo[n][sum] = Math.min(1 + subsetSum(arr, n, sum - arr[n - 1], memo), subsetSum(arr, n - 1, sum, memo));
        }

        return memo[n][sum];
    }
}

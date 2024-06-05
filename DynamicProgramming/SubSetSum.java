package DynamicProgramming;

public class SubSetSum {
    static Boolean isSubsetSum(int N, int arr[], int sum) {
        Boolean[][] memo = new Boolean[N + 1][sum + 1];
        return helper(N, arr, sum, memo);
    }
    static boolean helper(int n, int arr[], int sum, Boolean[][] memo) {
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (memo[n][sum] != null) {
            return memo[n][sum];
        }
        if (arr[n - 1] > sum) {
            memo[n][sum] = helper(n - 1, arr, sum, memo);
        } else {
            memo[n][sum] = helper(n - 1, arr, sum - arr[n - 1], memo) || helper(n - 1, arr, sum, memo);
        }
        return memo[n][sum];
    }
}

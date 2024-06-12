package DynamicProgramming;

public class MatrixChainMultiplication {
    static int matrixMultiplication(int N, int arr[]) {
        int i = 1;
        int j = N - 1;
        int dp[][] = new int[N][N];
        for (int ii = 0; ii < N; ii++) {
            for (int jj = 0; jj < N; jj++) {
                dp[ii][jj] = -1;
            }
        }
        return calculate(arr, i, j, dp);
    }

    static int calculate(int[] arr, int i, int j, int[][] dp) {
        if (i >= j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = calculate(arr, i, k, dp) + calculate(arr, k + 1, j, dp) + arr[i - 1] * arr[k] * arr[j];
            if (temp < ans) {
                ans = temp;
            }
        }
        dp[i][j] = ans;
        return ans;
    }
}

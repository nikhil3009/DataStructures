package DynamicProgramming;

public class KnapSack01 {
    static int[][] res;

    static int knapSack(int W, int wt[], int val[], int n)
    {
        // Initialize the memoization array with -1
        res = new int[W + 1][n + 1];
        for (int i = 0; i <= W; i++) {
            for (int j = 0; j <= n; j++) {
                res[i][j] = -1;
            }
        }
        return helper(W, wt, val, n);
    }

    static int helper(int W, int wt[], int val[], int n)
    {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (res[W][n] != -1) {
            return res[W][n];
        }

        if (wt[n-1] <= W) {
            res[W][n] = Math.max(
                    val[n-1] + helper(W - wt[n-1], wt, val, n - 1),
                    helper(W, wt, val, n - 1)
            );
        } else {
            res[W][n] = helper(W, wt, val, n - 1);
        }

        return res[W][n];
    }
}

package DynamicProgramming;

public class RodCuttingProblem {
    static int[][] res;

    public int cutRod(int price[], int n) {
        res = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                res[i][j] = -1;
            }
        }
        return helper(price, n, n);
    }

    static int helper(int price[], int length, int n) {
        if (n == 0 || length == 0) {
            return 0;
        }
        if (res[length][n] != -1) {
            return res[length][n];
        }
        if (n <= length) {
            res[length][n] = Math.max(
                    price[n - 1] + helper(price, length - n, n),
                    helper(price, length, n - 1)
            );
        } else {
            res[length][n] = helper(price, length, n - 1);
        }

        return res[length][n];
    }
}

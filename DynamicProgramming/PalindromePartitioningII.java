package DynamicProgramming;

public class PalindromePartitioningII {
    public int minCut(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;
        int dp[][] = new int[n][n];
        for (int ii = 0; ii < n; ii++) {
            for (int jj = 0; jj < n; jj++) {
                dp[ii][jj] = -1;
            }
        }
        return calculate(s, i, j, dp);

    }
    public int calculate(String s, int i, int j, int[][] dp) {
        if (i >= j) {
            return 0;
        }
        if(isPalindrome(s,i,j)){
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = calculate(s, i, k, dp) + calculate(s, k + 1, j, dp) + 1;
            if (temp < ans) {
                ans = temp;
            }
        }
        dp[i][j] = ans;
        return ans;
    }
    public boolean isPalindrome(String s, int i, int j){
        if(i<0 || j>= s.length()){
            return false;
        }
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

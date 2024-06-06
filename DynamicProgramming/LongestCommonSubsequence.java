package DynamicProgramming;

public class LongestCommonSubsequence {
    //Memoization
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m  = text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j] = -1;
            }
        }
        return lcs(text1,text2,n,m,dp);
    }
    public int lcs(String text1, String text2,int n, int m,int[][] dp){
        if(n == 0 || m == 0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(text1.charAt(n-1) == text2.charAt(m-1)){
            dp[n][m]  = 1+lcs(text1,text2,n-1,m-1,dp);
        }else{
            dp[n][m] = Math.max(lcs(text1,text2,n,m-1,dp),lcs(text1,text2,n-1,m,dp));
        }
        return dp[n][m];
    }



    //top-down
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m  = text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<=m;j++){
            dp[0][j] = 0;
        }


        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] =1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];

    }
}

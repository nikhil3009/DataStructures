package DynamicProgramming;

public class SuperEggDrop {
    int[][] dp = new int[101][10001];
    public int superEggDrop(int k, int n) {
        for(int i=0;i<=k;i++){
            for(int j=0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        return eggDrop(k,n);
    }
    public int eggDrop(int k, int n){
        if(k ==1 ){
            return n;
        }
        if(n==0 || n == 1){
            return n;
        }
        if(dp[k][n] != -1){
            return dp[k][n];
        }
        int ans = Integer.MAX_VALUE;

        for(int e=1;e<=n;e++){
            int low, high;
            if(dp[k-1][e-1] != -1){
                low = dp[k-1][e-1];
            }
            else{
                low=eggDrop(k-1,e-1);
            }
            if(dp[k][n-e] !=-1){
                high = dp[k][n-e];
            }
            else{
                high=eggDrop(k,n-e);
            }
            int temp = 1+Math.max(low,high);
            ans = Math.min(ans,temp);
        }
        return dp[k][n] = ans;
    }
}

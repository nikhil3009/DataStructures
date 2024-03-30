package Graphs;

public class FloodFill_733 {
    public void dfs(int[][] image,int[][] ans,int[] delr,int[] delc,int sr,int sc,int iniColor,int color){
        int n = image.length;
        int m = image[0].length;
        ans[sr][sc] = color;
        for(int i = 0; i<4;i++){
            int row = sr+delr[i];
            int col = sc+delc[i];
            if(row>=0 && col>=0 && row<n && col<m && image[row][col] == iniColor && ans[row][col] != color){
                dfs(image,ans,delr,delc,row,col,iniColor, color);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor = image[sr][sc];
        int[][] ans = image;
        int[] delr = {0,0,1,-1};
        int[] delc = {1,-1,0,0};
        dfs(image,ans,delr,delc,sr,sc,iniColor,color);
        return ans;
    }
}

package Graphs;

public class NumberofIslands {
    class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first  = first;
            this.second = second;
        }

    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    count++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return count;

    }

    public void bfs(int row, int col, int[][] vis, char[][] grid){
        vis[row][col] = 1;
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};
        while(!q.isEmpty()){
            int crow = q.peek().first;
            int ccol = q.peek().second;
            q.remove();
            for(int i =0;i<4;i++){
                int nrow = crow+dRow[i];
                int ncol = ccol+dCol[i];
                if(nrow>=0 && nrow<n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1'){
                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow, ncol));

                }
            }
        }
    }
}

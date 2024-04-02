package Graphs;

public class SurroundedRegions_130 {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int vis[][] = new int[n][m];
        int dr[] = {0,0,1,-1};
        int dc[] = {1,-1,0,0};
        for(int j = 0; j<m;j++){
            if(board[0][j] == 'O' && vis[0][j] == 0){
                dfs(0,j,board,vis,n,m,dr,dc);
            }
            if(board[n-1][j] == 'O' && vis[n-1][j] == 0){
                dfs(n-1,j,board,vis,n,m,dr,dc);
            }
        }
        for(int i = 0; i<n;i++){
            if(board[i][0] == 'O' && vis[i][0] == 0){
                dfs(i,0,board,vis,n,m,dr,dc);
            }
            if(board[i][m-1] == 'O' && vis[i][m-1] == 0){
                dfs(i,m-1,board,vis,n,m,dr,dc);
            }
        }
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j] == 0 && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

    }
    public void dfs(int row, int col,char[][] board, int[][] vis,int n,int m,int[] dr, int[] dc){
        vis[row][col] = 1;
        for(int i = 0;i<4;i++){
            int nr = row + dr[i];
            int nc = col + dc[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc] == 0 && board[nr][nc] == 'O'){
                dfs(nr,nc,board,vis,n,m,dr,dc);
            }
        }
    }
}

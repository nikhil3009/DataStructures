package Graphs;

public class ShortestPathBinaryMatrix_1091 {
    class Pair{
        int dist;
        int row;
        int col;
        Pair(int dist,int row, int col){
            this.dist = dist;
            this.row = row;
            this.col = col;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (grid[0][0] != 0 || grid[n-1][m-1] != 0) return -1;
        Queue<Pair> q = new LinkedList<>();
        int dist[][] = new int[n][m];
        for(int i = 0;i<n;i++) {
            for(int j =0;j<m;j++) {
                dist[i][j] = (int)(1e9);
            }
        }
        dist[0][0] = 1;
        q.add(new Pair(1,0,0));
        int dr[] = {-1, -1, -1, 0, 1, 1, 1, 0};
        int dc[] = {-1, 0, 1, 1, 1, 0, -1, -1};
        while(!q.isEmpty()){
            Pair node  = q.poll();
            int cdist = node.dist;
            int row = node.row;
            int col = node.col;
            if (row == n-1 && col == m-1) return cdist;

            for(int i =0;i<8;i++){
                int nrow = dr[i]+row;
                int ncol = dc[i]+col;

                if(nrow>=0 && ncol>=0 && nrow<n && ncol <m && grid[nrow][ncol] == 0 && 1+cdist < dist[nrow][ncol]){
                    dist[nrow][ncol] = 1+cdist;
                    q.add(new Pair(1+cdist,nrow,ncol));
                }
            }
        }
        return -1;
    }
}


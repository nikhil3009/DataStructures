package Graphs;

public class DistinctIslands_711 {
    static class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static int distinctIsland(int [][] arr, int n, int m)
    {
        int vis[][] = new int[n][m];
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(arr[i][j] == 1 && vis[i][j] == 0){
                    count++;
                    bfs(i,j,arr,vis,n,m);


                }
            }
        }
        return count;
    }
    public static void bfs(int row, int col,int [][] arr, int[][] vis,int n, int m){
        Queue<Pair> q = new LinkedList<>();
        vis[row][col] = 1;
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
            int cr = q.peek().first;
            int  cc= q.peek().second;
            q.poll();
            int[] dr = {-1, 1, 0, 0};
            int[] dc = {0, 0, -1, 1};
            for (int i = 0; i < 4; i++) {
                int nr = cr + dr[i];
                int nc = cc + dc[i];
                if(nr>=0 && nc >= 0 && nr<n && nc< m && vis[nr][nc] == 0 && arr[nr][nc] == 1 ){
                    vis[nr][nc] = 1;
                    q.add(new Pair(nr,nc));

                }
            }
        }
    }
}

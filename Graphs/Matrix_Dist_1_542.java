package Graphs;

public class Matrix_Dist_1_542 {
    class Node{
        int first;
        int second;
        int third;
        Node(int first, int second, int third){
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int vis[][] = new int[n][m];
        int ans[][] = new int[n][m];
        Queue<Node> q = new LinkedList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] == 0){
                    q.add(new Node(i,j,0));
                    vis[i][j] = 1;
                }
                else{
                    vis[i][j] = 0;
                }
            }
        }
        int[] dr = {0,0,1,-1};
        int[] dc = {1,-1,0,0};
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            int steps = q.peek().third;
            q.remove();
            ans[row][col] = steps;
            for(int i = 0;i<4;i++){
                int nr = dr[i] + row;
                int nc = dc[i]+col;
                if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc] == 0){
                    vis[nr][nc] = 1;
                    q.add(new Node(nr,nc,steps+1));
                }
            }
        }
        return ans;

    }
}

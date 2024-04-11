package Graphs;

public class PathWithMinimumEffort_1631 {
    class Pair{
        int height;
        int row;
        int col;
        Pair(int height,int row,int col){
            this.height = height;
            this.row =row;
            this.col = col;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Pair> q = new PriorityQueue<Pair>((x,y)->x.height-y.height);
        int n = heights.length;
        int m = heights[0].length;
        int efforts[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                efforts[i][j] =(int)1e9;
            }
        }
        efforts[0][0] = 0;
        q.add(new Pair(0,0,0));
        int drow[] = {0,0,1,-1};
        int dcol[] = {1,-1,0,0};
        while(!q.isEmpty()){
            Pair node = q.poll();
            int curEff = node.height;
            int crow = node.row;
            int ccol = node.col;
            if(crow == n-1 && ccol == m-1){
                return curEff;
            }
            for(int i=0;i<4;i++){
                int nrow = drow[i]+crow;
                int ncol = dcol[i]+ccol;
                if(nrow>=0 && ncol>=0 && nrow<n && ncol<m){
                    int effort = Math.max(Math.abs(heights[crow][ccol]-heights[nrow][ncol]),curEff);
                    if(effort<efforts[nrow][ncol]){
                        efforts[nrow][ncol] = effort;
                        q.add(new Pair(effort,nrow,ncol));
                    }
                }
            }
        }
        return 0;
    }
}

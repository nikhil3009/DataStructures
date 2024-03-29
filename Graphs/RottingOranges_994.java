package Graphs;

public class RottingOranges_994 {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int cntf = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i<row;i++){
            for(int j = 0; j<col;j++){
                if(grid[i][j] == 2){
                    q.offer(new int[] {i,j});
                }
                if(grid[i][j] != 0){
                    cntf++;
                }
            }
        }
        if(cntf == 0){
            return 0;
        }
        int cnt = 0;
        int cntm = 0;
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        while(!q.isEmpty()){
            int size = q.size();
            cnt += size;
            for(int i = 0; i<size;i++){
                int[] cur = q.poll();
                for(int j = 0; j<4;j++){
                    int x = cur[0] + dx[j];
                    int y = cur[1]+dy[j];

                    if(x<0 || y<0 || x>=row || y>=col || grid[x][y] == 2 || grid[x][y] == 0){
                        continue;
                    }
                    grid[x][y] = 2;
                    q.offer(new int[] {x,y});
                }

            }
            if(!q.isEmpty()){
                cntm++;
            }
        }

        return (cnt == cntf ? cntm :-1);
    }
}

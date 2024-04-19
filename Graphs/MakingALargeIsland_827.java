class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }
}


class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        DisjointSet ds = new DisjointSet(n*n);
        for(int row =0;row<n;row++){
            for(int col =0;col<n;col++){
                if(grid[row][col] == 0){
                    continue;
                }
                int dr[] ={0,0,1,-1};
                int dc[] ={1,-1,0,0};
                for(int i=0;i<4;i++){
                    int adr = row+dr[i];
                    int adc = col+dc[i];
                    if(adr>=0 && adr<n && adc>=0 && adc<n && grid[adr][adc] ==1){
                        int node = row*n+col;
                        int adjnode = adr*n+adc;
                        ds.unionBySize(node,adjnode);
                    }
                }

            }
        }
        int max =0;
        for(int row =0;row<n;row++){
            for(int col =0;col<n;col++){
                if(grid[row][col] == 1){
                    continue;
                }
                HashSet<Integer> cmp = new HashSet<>();
                int dr[] ={0,0,1,-1};
                int dc[] ={1,-1,0,0};
                for(int i=0;i<4;i++){
                    int adjr = row+dr[i];
                    int adjc = col+dc[i];
                    if(adjr>=0 && adjr<n && adjc>=0 && adjc<n && grid[adjr][adjc] ==1){
                        cmp.add(ds.findUPar(adjr*n+adjc));
                    }
                }
                int totalSize =0;
                for(Integer parent:cmp){
                    totalSize += ds.size.get(ds.findUPar(parent));
                }
                max = Math.max(max,totalSize+1);
            }
            for (int cellNo = 0; cellNo < n * n; cellNo++) {
                max = Math.max(max, ds.size.get(ds.findUPar(cellNo)));
            }
        }
        return max;
    }
}
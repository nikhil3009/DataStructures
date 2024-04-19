package Graphs;
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
        int root = findUPar(parent.get(node));
        parent.set(node, root);
        return root;
    }

    public void unionByRank(int u, int v) {
        int rootU = findUPar(u);
        int rootV = findUPar(v);
        if (rootU == rootV) return;
        if (rank.get(rootU) < rank.get(rootV)) {
            parent.set(rootU, rootV);
        } else if (rank.get(rootV) < rank.get(rootU)) {
            parent.set(rootV, rootU);
        } else {
            parent.set(rootV, rootU);
            rank.set(rootU, rank.get(rootU) + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int rootU = findUPar(u);
        int rootV = findUPar(v);
        if (rootU == rootV) return;
        if (size.get(rootU) < size.get(rootV)) {
            parent.set(rootU, rootV);
            size.set(rootV, size.get(rootV) + size.get(rootU));
        } else {
            parent.set(rootV, rootU);
            size.set(rootU, size.get(rootU) + size.get(rootV));
        }
    }
}

public class NumberofIslands_II_305 {

    public static int[] numberOfIslandII(int n, int m, int [][]queries, int q) {
        DisjointSet ds = new DisjointSet(n*m);
        int vis[][] = new int[n][m];
        int ans[] = new int[q];
        int count = 0;
        for(int i =0;i<q;i++){
            int row = queries[i][0];
            int col = queries[i][1];
            if(vis[row][col] == 1){
                ans[i] = count;
                continue;
            }
            vis[row][col] = 1;
            count++;
            int dr[] = {0,0,1,-1};
            int dc[] = {1,-1,0,0};
            for(int j=0;j<4;j++){
                int adjr = row+dr[j];
                int adjc = col+dc[j];
                if(adjr>=0 && adjr<n && adjc >=0 && adjc<m){
                    if(vis[adjr][adjc]==1){
                        int node = row*m+col;
                        int adjnode = adjr*m+adjc;
                        if(ds.findUPar(node)!=ds.findUPar(adjnode)){
                            ds.unionBySize(node,adjnode);
                            count--;
                        }
                    }
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}

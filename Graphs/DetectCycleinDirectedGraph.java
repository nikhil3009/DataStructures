package Graphs;

public class DetectCycleinDirectedGraph {
    public static Boolean isCyclic(int[][] edges, int v, int e)
    {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        int vis[] = new int[v];
        int pvis[] = new int[v];
        for(int i = 0;i<v;i++){
            if(dfs(i,vis,pvis,adj,v) == true){
                return true;
            }
        }
        return false;
    }
    public static Boolean dfs(int node,int[] vis, int[] pvis, List<List<Integer>> adj ,int v){
        vis[node] =1;
        pvis[node] = 1;
        for(int it:adj.get(node)){
            if(vis[it] == 0){
                if(dfs(it,vis,pvis,adj,v) == true){
                    return true;
                }
            }
            else if(pvis[it] == 1){
                return true;
            }
        }
        pvis[node] = 0;
        return false;
    }
}

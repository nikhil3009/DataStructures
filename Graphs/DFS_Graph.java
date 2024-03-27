package Graphs;

public class DFS_Graph {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        vis[0] = true;
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0,vis,ans,adj);
        return ans;
    }
    public void dfs(int node, boolean[] vis,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj ){
        vis[node] = true;
        ans.add(node);
        for(int it: adj.get(node)){
            if(vis[it] == false){
                dfs(it,vis,ans,adj);
            }
        }
    }
}

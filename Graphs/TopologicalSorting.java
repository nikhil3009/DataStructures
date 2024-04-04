package Graphs;

public class TopologicalSorting {
    public static List<Integer> topologicalSort(int[][] edges, int e, int v) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        int vis[] = new int[v];
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<v;i++){
            if(vis[i] == 0){
                dfs(i,adj,vis,v,st);
            }
        }
        while(!st.isEmpty()){
            ans.add(st.peek());
            st.pop();
        }
        return ans;

    }
    public static void dfs(int node, List<List<Integer>> adj, int[] vis, int v, Stack<Integer> st){
        vis[node] = 1;
        for(int it:adj.get(node)){
            if(vis[it] == 0){
                dfs(it,adj,vis,v,st);
            }
        }
        st.push(node);
    }

}

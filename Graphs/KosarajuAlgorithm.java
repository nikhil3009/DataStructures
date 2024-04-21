package Graphs;

public class KosarajuAlgorithm {
    public static void dfs(int node,int[] vis,ArrayList<ArrayList<Integer>> edges,Stack<Integer> st){
        vis[node] = 1;
        for(Integer it:edges.get(node)){
            if(vis[it]==0){
                dfs(it,vis,edges,st);
            }
        }
        st.push(node);
    }
    public static void dfsk(int node,int[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        for(Integer it:adj.get(node)){
            if(vis[it]==0){
                dfsk(it,vis,adj);
            }
        }

    }
    public static int stronglyConnectedComponents(int v, ArrayList<ArrayList<Integer>> edges) {
        Stack<Integer> st = new Stack<>();
        int vis[] = new int[v];
        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, edges, st);
            }
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < v; i++) {
            vis[i] = 0;
            for (Integer it : edges.get(i)) {
                adj.get(it).add(i);
            }
        }
        int scc = 0;
        while (!st.isEmpty()) {
            int node = st.peek();
            st.pop();
            if (vis[node] == 0) {
                scc++;
                dfsk(node, vis, adj);
            }
        }
        return scc;
    }
}

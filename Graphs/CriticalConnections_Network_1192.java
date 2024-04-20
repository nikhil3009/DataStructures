package Graphs;

public class CriticalConnections_Network_1192 {
    private int timer = 1;
    private void dfs(int node, int parent,ArrayList<ArrayList<Integer>> adj,List<List<Integer>> bridges,int vis[],int tim[],int lowt[]){
        vis[node] = 1;
        tim[node] = lowt[node] = timer;
        timer++;
        for(Integer it : adj.get(node)){
            if(it == parent){
                continue;
            }
            if(vis[it] == 0){
                dfs(it,node,adj,bridges,vis,tim,lowt);
                lowt[node] = Math.min(lowt[node],lowt[it]);
                if(lowt[it]>tim[node]){
                    bridges.add(Arrays.asList(it,node));

                }

            }
            else{
                lowt[node] = Math.min(lowt[node],lowt[it]);
            }
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        List<List<Integer>> bridges = new ArrayList<>();
        int vis[] = new int[n];
        int tim[] = new int[n];
        int lowt[] = new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(List<Integer> it : connections){
            int u = it.get(0);
            int v = it.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dfs(0,-1,adj,bridges,vis,tim,lowt);
        return bridges;
    }
}

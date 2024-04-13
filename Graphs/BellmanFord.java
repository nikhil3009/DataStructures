package Graphs;

public class BellmanFord {
    public static int[] bellmonFord(int n, int m, int src, List<List<Integer>> edges) {
        int dist[] = new int[n];
        for(int i=0;i<n;i++){
            dist[i] = (int)1e9;
        }
        dist[src] = 0;
        for(int i=0;i<n-1;i++){
            for(List<Integer> edge:edges){
                int u = edge.get(0);
                int v = edge.get(1);
                int wt = edge.get(2);
                if(dist[u]!=1e9 && dist[u]+wt<dist[v]){
                    dist[v]=wt+dist[u];
                }
            }
        }
        for(List<Integer> edge:edges){
            int u = edge.get(0);
            int v = edge.get(1);
            int wt = edge.get(2);
            if(dist[u]!=1e9 && dist[u]+wt<dist[v]){
                return new int[]{-1};
            }
        }
        return dist;
    }
}

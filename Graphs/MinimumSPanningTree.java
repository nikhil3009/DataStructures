package Graphs;

public class MinimumSPanningTree {
    static class Pair{
        int dist;
        int node;
        Pair(int dist, int node){
            this.dist = dist;
            this.node = node;
        }
    }
    public static int minimumSpanningTree(ArrayList<ArrayList<Integer>> edges, int n) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->x.dist-y.dist);
        int vis[] = new int[n];
        pq.add(new Pair(0,0));
        int sum = 0;
        while(!pq.isEmpty()){
            int wt = pq.peek().dist;
            int node = pq.peek().node;
            if(vis[node] == 1){
                continue;
            }
            vis[node] = 1;
            sum = sum+wt;
            for(int i=0;i<edges.get(node).size();i++){
                int bnode = edges.get(node).get(i).get(0);
                int nwt = edges.get(node).get(i).get(1);
                if(vis[nwt]==0){
                    pq.add(new Pair(nwt,bnode));
                }
            }
        }
        return sum;

    }
}

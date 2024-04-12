package Graphs;

public class NumWaystoArriveDestination_1976 {
    class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public int countPaths(int n, int[][] roads) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i =0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] road : roads){
            int u = road[0];
            int v = road[1];
            int w = road[2];
            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));
        }
        PriorityQueue<Pair> q = new PriorityQueue<>((x,y)->x.first-y.first);
        int ways[] = new int[n];
        int dist[] = new int[n];
        for(int i=0;i<n;i++){
            ways[i] = 0;
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;
        ways[0] = 1;
        q.add(new Pair(0,0));
        int mod = (int)(1e9 + 7);
        while(!q.isEmpty()){
            Pair node = q.poll();
            int curd = node.first;
            int curp = node.second;
            for(Pair it : adj.get(curp)){
                int np = it.first;
                int nw = it.second;
                if(curd+nw<dist[np]){
                    dist[np] = curd+nw;
                    q.add(new Pair(curd+nw,np));
                    ways[np] = ways[curp];
                }
                else if(curd+nw == dist[np]){
                    ways[np] = (ways[curp]+ways[np]) % mod;
                }
            }
        }
        return ways[n-1] % mod;
    }

}

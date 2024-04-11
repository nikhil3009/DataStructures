package Graphs;

public class CheapestFlightsWithinKStops_787 {
    class Pair{
        int point;
        int cost;
        Pair(int point,int cost){
            this.point = point;
            this.cost = cost;
        }
    }
    class Tupple{
        int stop;
        int dPoint;
        int cos;
        Tupple(int stop, int dPoint, int cos){
            this.stop = stop;
            this.dPoint = dPoint;
            this.cos = cos;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0; i<n;i++){
            adj.add(new ArrayList<>());
        }
        int m = flights.length;
        for(int i =0; i<m;i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        Queue<Tupple> q = new LinkedList<>();
        q.add(new Tupple(0,src,0));
        int dist[] = new int[n];
        for(int i=0;i<n;i++){
            dist[i] = (int)1e9;
        }
        dist[src] = 0;

        while(!q.isEmpty()){
            Tupple node = q.poll();
            int stop = node.stop;
            int cpnt = node.dPoint;
            int cost = node.cos;

            if(stop>k){
                continue;
            }
            for(Pair it : adj.get(cpnt)){
                int nepoint = it.point;
                int ccost = it.cost;
                if(cost+ccost<dist[nepoint] && stop<=k){
                    dist[nepoint] = cost+ccost;
                    q.add(new Tupple(stop+1,nepoint,cost+ccost));
                }
            }
        }
        if(dist[dst] == (int)1e9){
            return -1;
        }
        return dist[dst];
    }
}


package Graphs;
import java.util.*;
public class Dijkstra {
    class Pair{
        int distance;
        int node;
        Pair(int distance, int node){
            this.distance = distance;
            this.node = node;
        }

    }

    public static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->x.distance-y.distance);
        int dist[] = new dist[V];
        Arrays.fill(dist,(int)1e9);

        dist[S] = 0;
        pq.add(new Pair(0,S));

        while(pq.size()!=0){
            int dis = pq.peek().distance;
            int node = pq.peek().node;

            for(int i=0;i<adj.get(node).size();i++){
                int edgewt = adj.get(node).get(i).get(1);
                int bnode = adj.get(node).get(i).get(0);
                if(edgewt+dis < dist[bnode]){
                    dist[bnode] = edgewt+dis;
                    pq.add(new Pair(dis[bnode],bnode));
                }
            }
        }
        return dist;
    }
}

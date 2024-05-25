package Blind75;

public class GrapghValidTree {
    public boolean GrapghValidTree(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        q.add(0);
        count = count+1;
        vis[0] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);
            for(int it : adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    count = count+1;
                    q.add(it);
                }
            }
        }
        return count == n ? true : false;
    }
}

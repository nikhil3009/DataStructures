package Graphs;

public class KhansAlgotoDetectCycleandTOPOfind {
    public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
        int[] topo = new int[n];
        for(int i = 0; i<n;i++){
            for(int it:edges.get(i)){
                topo[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<n;i++){
            if(topo[i] == 0){
                q.add(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.poll();
            count++;
            for(int it : .get(node)){
                topo[it]--;
                if(topo[it] == 0){
                    q.add(it);
                }
            }
        }
        if(count == n){
            return false;
        }
        return true;
    }
}

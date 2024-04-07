package Graphs;

public class FindEventualSafeStates_802 {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++){
            for(int j : graph[i]){
                adj.get(j).add(i);
            }
        }
        int ind[] = new int[n];
        for(int i = 0; i<n;i++){
            for(int it:adj.get(i)){
                ind[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<n; i++){
            if(ind[i] == 0){
                q.add(i);
                ans.add(i);
            }
        }


        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for(int it:adj.get(node)){
                ind[it]--;
                if(ind[it] == 0){
                    q.add(it);
                    ans.add(it);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}

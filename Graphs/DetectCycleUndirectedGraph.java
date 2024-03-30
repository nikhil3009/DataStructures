package Graphs;

public class DetectCycleUndirectedGraph {
    static class Node {
        int first;
        int second;
        public Node(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static class Graph {
        boolean detectCycle(int V, List<List<Integer>> adj) {
            boolean[] vis = new boolean[V];

            for (int i = 0; i < V; i++) {
                if (!vis[i]) {
                    if (detect(adj, vis, i)) {
                        return true;
                    }
                }
            }
            return false;
        }

        boolean detect(List<List<Integer>> adj, boolean[] vis, int i) {
            Queue<Node> q = new LinkedList<>();
            q.add(new Node(i, -1));
            vis[i] = true;

            while (!q.isEmpty()) {
                int cur = q.peek().first;
                int par = q.peek().second;
                q.remove();

                for (Integer it : adj.get(cur)) {
                    if (!vis[it]) {
                        q.add(new Node(it, cur));
                        vis[it] = true;
                    } else if (par != it) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}

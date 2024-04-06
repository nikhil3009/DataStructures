package Graphs;

public class CourseSchedule_I_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int ind[] = new int[numCourses];
        for(int i = 0;i<numCourses;i++){
            for(int it:adj.get(i)){
                ind[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<numCourses;i++){
            if(ind[i] == 0){
                q.add(i);
            }
        }
        List<Integer> topo = new LinkedList<>();
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            topo.add(node);
            for(int it:adj.get(node)){
                ind[it]--;
                if(ind[it] == 0){
                    q.add(it);
                }
            }
        }

        if(topo.size() == numCourses){
            return true;
        }

        return false;

    }
}

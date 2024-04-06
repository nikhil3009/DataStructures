package Graphs;

public class CourseSchedule_II_210 {
    List<List<Integer>> adj = new ArrayList<>();
        for(
    int i = 0;
    i<numCourses;i++)

    {
        adj.add(new ArrayList<>());
    }
        for(
    int i = 0;
    i<prerequisites.length;i++)

    {
        adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
    }

    int ind[] = new int[numCourses];
        for(
    int i = 0;
    i<numCourses;i++)

    {
        for (int it : adj.get(i)) {
            ind[it]++;
        }
    }

    Queue<Integer> q = new LinkedList<>();
        for(
    int i = 0;
    i<numCourses;i++)

    {
        if (ind[i] == 0) {
            q.add(i);
        }
    }

    int topo[] = new int[numCourses];
    int j = 0;
        while(!q.isEmpty())

    {
        int node = q.peek();
        q.remove();
        topo[j++] = node;
        for (int it : adj.get(node)) {
            ind[it]--;
            if (ind[it] == 0) {
                q.add(it);
            }
        }
    }

        if(j ==numCourses)

    {
        return topo;
    }

    int[] arr = {};
        return arr;
}
}

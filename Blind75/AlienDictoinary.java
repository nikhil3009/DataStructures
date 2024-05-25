package Blind75;

public class AlienDictoinary {
        public List<Integer> toposort(int K,List<List<Integer>> adj ){
            int ind[] = new int[K];
            for(int i=0;i<K;i++){
                for(int it : adj.get(i)){
                    ind[it]++;
                }
            }
            Queue<Integer> q = new LinkedList<>();
            for(int j=0;j<K;j++){
                if(ind[j] == 0){
                    q.add(j);
                }
            }
            List<Integer> topo = new ArrayList<>();
            while(!q.isEmpty()){
                int cur = q.poll();
                topo.add(cur);
                for(int it:adj.get(cur)){
                    ind[it]--;
                    if(ind[it] == 0){
                        q.add(it);
                    }
                }
            }
            return topo;
        }
        public String findOrder(String [] dict, int N, int K)
        {
            List<List<Integer>> adj = new ArrayList<>();
            for(int i=0;i<K;i++){
                adj.add(new ArrayList<>());
            }

            for(int j=0;j<N-1;j++){
                String s1 = dict[j];
                String s2 = dict[j+1];
                int len = Math.min(s1.length(),s2.length());
                for(int k=0;k<len;k++){
                    if(s1.charAt(k) != s2.charAt(k)){
                        adj.get(s1.charAt(k)-'a').add(s2.charAt(k)-'a');
                        break;
                    }
                }

            }

            List<Integer> topo =  topo = toposort(K,adj);
            StringBuilder ans = new StringBuilder();

            for(int it:topo){
                ans.append((char) (it + 'a'));
            }
            return ans.toString();





        }
    }
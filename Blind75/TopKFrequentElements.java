package Blind75;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int num : nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        List<Integer>[] temp = new List[n+1];
        for(int i=0;i<=n;i++){
            temp[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            int freq = entry.getValue();
            temp[freq].add(entry.getKey());
        }

        List<Integer> cur = new ArrayList<>();
        for(int i=n;i>=0&cur.size()<k;i--){
            if(!temp[i].isEmpty()){
                cur.addAll(temp[i]);
            }
        }

        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = cur.get(i);
        }
        return ans;

    }
}

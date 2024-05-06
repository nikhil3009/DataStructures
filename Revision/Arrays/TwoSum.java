package Revision.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            int moreneeded = target-num;
            if(mp.containsKey(moreneeded)){
                ans[0] = mp.get(moreneeded);
                ans[1] = i;
                return ans;
            }
            mp.put(num,i);
        }
        return ans;
    }
}

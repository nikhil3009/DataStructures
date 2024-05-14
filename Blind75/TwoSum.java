package Blind75;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0] = ans[1] = -1;
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int more = target - nums[i];
            if(mp.containsKey(more)){
                ans[0] = mp.get(more);
                ans[1] = i;
                return ans;
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return ans;
    }
}

package Blind75;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(nums,0,ans,subset);
        return ans;

    }
    public void backtrack(int[] nums, int i,List<List<Integer>> ans,List<Integer> subset){
        if(i == nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        backtrack(nums,i+1,ans,subset);
        subset.remove(subset.size()-1);
        backtrack(nums,i+1,ans,subset);
    }
}

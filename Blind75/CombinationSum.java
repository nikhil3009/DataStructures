package Blind75;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        int n = candidates.length;
        backtrack(candidates,target,ans,sol,0,0);
        return ans;

    }
    public void backtrack(int[] candidates, int target,List<List<Integer>> ans, List<Integer> sol,int i, int curSum){
        if(curSum == target){
            ans.add(new ArrayList<>(sol));
            return;
        }
        if(curSum >target || i == candidates.length){
            return;
        }

        backtrack(candidates,target,ans,sol,i+1,curSum);
        sol.add(candidates[i]);
        backtrack(candidates,target,ans,sol,i,curSum+candidates[i]);
        sol.remove(sol.size()-1);
    }
}

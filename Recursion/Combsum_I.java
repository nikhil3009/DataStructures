package Recursion;

public class Combsum_I {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(0,candidates,target,result, new ArrayList<>());
        return result;

    }
    public void findCombinations(int index, int[] candidates,int target, List<List<Integer>> result, List<Integer> combres )
    {
        if(index == candidates.length){
            if(target == 0){
                result.add(new ArrayList<>(combres));
            }
            return;
        }
        if(candidates[index]<=target){
            combres.add(candidates[index]);
            findCombinations(index,candidates,target-candidates[index],result, combres);
            combres.remove(combres.size()-1);
        }
        findCombinations(index+1,candidates,target,result, combres);
    }
}

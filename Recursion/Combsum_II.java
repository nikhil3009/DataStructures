package Recursion;

public class Combsum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates,target,result,new ArrayList<>());
        return result;
    }
    public void findCombinations(int index, int[] candidates,int target, List<List<Integer>> result, List<Integer> comb){
        if(target == 0){
            result.add(new ArrayList<>(comb));
            return;
        }
        for(int i = index;i<candidates.length;i++){
            if(i>index && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            comb.add(candidates[i]);
            findCombinations(i+1,candidates,target-candidates[i],result,comb);
            comb.remove(comb.size()-1);
        }
    }
}

package Recursion;

public class PrintSubSet {

    List<List<Integer>> result = new ArrayList<>();
    generateSubsets(nums,0,new ArrayList<>(),result);
       return result;
}
    public void generateSubsets(int[] nums, int index, List<Integer> subset, List<List<Integer>> result){
        if(index == nums.length){
            retu
        }
        subset.add(nums[index]);
        generateSubsets(nums,index+1,subset,result);
        subset.remove(subset.size()-1);
        generateSubsets(nums,index+1,subset,result);

    }
}

package Recursion;

public class PrintPermutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutes(0,nums,result);
        return result;
    }
    public void generatePermutes(int index, int[] nums, List<List<Integer>> result){
        if(index==nums.length){
            List<Integer> subans = new ArrayList<>();
            for(int i =0;i<nums.length;i++){
                subans.add(nums[i]);
            }
            result.add(subans);
        }
        for(int i = index;i<nums.length;i++){
            swap(i,index,nums);
            generatePermutes(index+1,nums,result);
            swap(i,index,nums);
        }
    }
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

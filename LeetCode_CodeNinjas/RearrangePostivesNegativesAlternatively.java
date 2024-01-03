package LeetCode_CodeNinjas;
Import java.util.*;

public class RearrangePostivesNegativesAlternatively {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int posIndex = 0;
        int negIndex = 1;
        for(int i = 0; i<n;i++){
            if(nums[i]<0){
                ans.set(negIndex,nums[i]);
                negIndex+=2;
            }
            else{
                ans.set(posIndex,nums[i]);
                posIndex += 2;

            }
        }
        return ans.stream().mapToInt(i -> i).toArray();

    }
}

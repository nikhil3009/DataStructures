package LeetCode_CodeNinjas;
import java.util.*;
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(nums);
        int last = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;
        for(int i = 0;i<n;i++){
            if(nums[i]-1 == last){
                count+=1;
                last = nums[i];
            }
            else if(nums[i] !=last ){
                count =1;
                last = nums[i];

            }
            longest = Math.max(longest,count);
        }
        return longest;
    }

}

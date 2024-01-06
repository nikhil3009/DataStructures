package LeetCode_CodeNinjas;
import java.util.*;
public class CountSubArraySum {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        int count =0;

        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int n = nums.length;
        for(int i =0;i<n;i++){
            prefixSum += nums[i];
            int remove = prefixSum - k;
            count += mpp.getOrDefault(remove,0);
            mpp.put(prefixSum,mpp.getOrDefault(prefixSum,0)+1);
        }
        return count;

    }
}

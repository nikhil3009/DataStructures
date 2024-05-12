package Blind75;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int ans =Integer.MIN_VALUE;

        int n =  nums.length;
        int prefixSum = 1;
        int sufixSum = 1;
        for(int i=0;i<n;i++){
            if(prefixSum == 0){
                prefixSum = 1;
            }
            if(sufixSum == 0){
                sufixSum = 1;
            }
            prefixSum *= nums[i];
            sufixSum *= nums[n-i-1];
            ans = Math.max(ans,Math.max(prefixSum,sufixSum));
        }
        return ans;

    }
}

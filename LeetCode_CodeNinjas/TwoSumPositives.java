package LeetCode_CodeNinjas;

public class TwoSumPositives {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int left = 0;
        int right = 0;
        long sum = a[0];
        int maxLen = 0;
        while(right<a.length){
            while(left<=right && sum>k){
                sum -= a[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<a.length){
                sum = sum + a[right];
            }

        }
        return maxLen;

        // Write your code here
    }
}

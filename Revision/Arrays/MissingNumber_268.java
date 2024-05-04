package Revision.Arrays;

public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = (n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        return actualSum-sum;

    }
}

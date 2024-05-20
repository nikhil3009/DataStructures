package Blind75;

public class MinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[low] <= nums[high]){
                ans = Math.min(ans,nums[low]);
                break;
            }
            else if(nums[low] <= nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid+1;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                high = mid-1;
            }
        }
        return ans;

    }
}
package BinarySearch;

public class SmallestDivisorByThreshold {
    public int calculateT(int[] nums, int mid){
        int n = nums.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += Math.ceil((double)nums[i]/(double)mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n>threshold){
            return -1;
        }
        int low = 1;
        int max = 0;
        for(int  i = 0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int high = max;
        while(low<=high){
            int mid = low+(high-low)/2;
            int divisor = calculateT(nums,mid);
            if(divisor<=threshold){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;

    }
}

package BinarySearch;

public class FirstAndLastOccurances {
    public int[] searchRange(int[] nums, int target) {
        int first = searchFirst(nums,target);
        if(first == -1) return new int[] {-1,-1};
        int last = searchLast(nums,target);
        return new int[] {first,last};
    }
    public int searchFirst(int[] nums,int target){
        int n = nums.length;
        int start = 0 ;
        int end = n-1;
        int ansF = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                ansF = mid;
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ansF;
    }
    public int searchLast(int[] nums,int target){
        int n = nums.length;
        int start = 0 ;
        int end = n-1;
        int ansL = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                ansL = mid;
                start = mid+1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ansL;
    }
}

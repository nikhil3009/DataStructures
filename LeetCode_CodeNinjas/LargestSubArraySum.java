package LeetCode_CodeNinjas;

public class LargestSubArraySum {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        int n = arr.length;
        HashMap<Integer,Integer> mpp = new HashMap<Integer,Integer>();
        int sum = 0;
        int maxi = 0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
            if(sum == 0){
                maxi = i+1;
            }
            else{
                if(mpp.get(sum)!=null){
                    maxi=Math.max(maxi, i-mpp.get(sum));
                }
                else{
                    mpp.put(sum,i);
                }
            }
        }
        return maxi;
    }
}

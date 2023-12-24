package Arrays.Medium;

public class MaximumSUbarraySum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
    public static long maxSubarraySum(int[] arr, int n)
    {
        long sum = 0;
        long maxi = Long.MIN_VALUE;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for(int i = 0; i<n;i++){
            if(sum == 0){
                start = i;
            }
            sum+=arr[i];
            if(sum>maxi){
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]n");
return maxi;

    }
}

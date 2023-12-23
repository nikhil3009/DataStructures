package Arrays.Easy;

public class LongestSubArray
{
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
    static int getLongestSubarray(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxlen = 0;
        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;

            }
            if (sum == k) {
                maxlen = Math.max(maxlen, (right = left + 1));
            }
            right++;
            if (right < arr.length) {
                sum += arr[right];
            }

        }
        return maxlen;

    }
}

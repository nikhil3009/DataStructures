package DynamicProgramming;

class Solution {

    public int perfectSum(int arr[], int n, int sum)
    {
        // Create a memoization table initialized to null values
        Integer[][] memo = new Integer[n+1][sum+1];
        return subsetSum(arr, n, sum, memo);
    }

    private int subsetSum(int[] arr, int n, int sum, Integer[][] memo) {
        // If the sum is zero, there is one valid subset (the empty subset)
        if (sum == 0) {
            return 1;
        }
        // If no elements are left and sum is not zero, no valid subset
        if (n == 0) {
            return 0;
        }
        // Use memoized result if available
        if (memo[n][sum] != null) {
            return memo[n][sum];
        }

        // If the current element is greater than the remaining sum, skip it
        if (arr[n-1] > sum) {
            memo[n][sum] = subsetSum(arr, n-1, sum, memo);
        } else {
            // Calculate the count by including and excluding the current element
            memo[n][sum] = subsetSum(arr, n-1, sum - arr[n-1], memo) + subsetSum(arr, n-1, sum, memo);
        }

        return memo[n][sum];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {9, 7, 0, 3, 9, 8, 6, 5, 7, 6};
        int n = arr.length;
        int sum = 31;
        System.out.println(sol.perfectSum(arr, n, sum));  // Output should be 40
    }
}


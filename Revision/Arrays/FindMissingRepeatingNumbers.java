package Revision.Arrays;

public class FindMissingRepeatingNumbers {
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        long sn = (n*(n+1))/2;
        long s2n = (n*(n+1)*(2*n+1))/6;
        long sum = 0;
        long sum2 = 0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            sum2 += arr[i] * arr[i];
        }

        long xminusy = sum - sn;
        long x2minusy2 = sum2 - s2n;
        long xplusy = x2minusy2/xminusy;

        long missing = (xplusy + xminusy)/2;
        long repeat = xplusy  - missing;

        ans[1] = (int)repeat;
        ans[0] = (int)missing;

        return ans;

    }
}

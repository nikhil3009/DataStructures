package LeetCode_CodeNinjas;

public class MissingAndRepeatingNumber {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        long sum =0;
        long sumn = ((long)n*(n+1))/2;
        long squaresum = 0;
        long squaresumN = ((long)n*(n+1)*((2*n)+1))/6;
        for(int i = 0;i< n;i++){
            sum += arr.get(i);
            squaresum += (long)arr.get(i) * arr.get(i);
        }
        long val1 = sum - sumn;
        long val2 = squaresum - squaresumN;
        val2 = val2/val1;
        long x = (val2+val1)/2;
        long y = x-val1;

        int[] ans = {(int)y,(int)x};
        return ans;

    }
}

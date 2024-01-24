package BinarySearch;

public class SquareRootBinarySearch {
    public static int sqrtN(long N) {
        long low = 1;
        long high = N;
        while(low<=high){
            long mid = low+(high-low)/2;
            long val = mid*mid;
            if(val<=N){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return int(high);

    }
}

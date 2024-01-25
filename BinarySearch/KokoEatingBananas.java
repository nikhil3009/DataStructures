package BinarySearch;

public class KokoEatingBananas {
    public int max(int[] piles){
        int max = 0;
        for(int i = 0; i<piles.length;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }
        return max;
    }
    public int findHour(int[] piles, int hourly){
        int n = piles.length;
        int reqHour = 0;
        for(int i = 0; i<n;i++){
            reqHour += Math.ceil((double)piles[i]/(double)hourly);
        }
        return reqHour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0; int high = max(piles);
        while(low<=high){
            int mid = low+(high-low)/2;
            int totalTime= findHour(piles,mid);
            if(totalTime<= h){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;

    }
}

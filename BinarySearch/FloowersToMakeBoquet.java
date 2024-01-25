package BinarySearch;

public class FloowersToMakeBoquet {
    public boolean possibleBoque(int[] bloomDay,int rate, int m, int k){
        int count = 0;
        int tCount = 0;
        for(int i = 0; i<bloomDay.length;i++){
            if(bloomDay[i]<=rate){
                count ++;
            }
            else{
                tCount += count/k;
                count = 0;
            }

        }
        tCount += count/k;
        return(tCount>=m);

    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length){
            return -1;
        }
        int min = Integer.MAX_VALUE; int max = Integer.MIN_VALUE;
        for(int i= 0 ;i<bloomDay.length;i++){
            min  = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]);
        }
        int low = min; int high = max;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possibleBoque(bloomDay,mid,m,k)){
                high  = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;

    }
}

package BinarySearch;

public class CapacityToShipPacages {
    public int calculateDays(int[] weights, int mid){
        int days = 1;
        int load = 0;
        int n = weights.length;
        for(int i = 0; i<n;i++){
            if(mid<load+weights[i]){
                days++;
                load = weights[i];
            }
            else{
                load = load +weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = 0;
        int high = 0;
        for(int i = 0;i<n;i++){
            if(weights[i]>low){
                low = weights[i];
            }
            high = high+weights[i];
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            int noDays = calculateDays(weights,mid);
            if(noDays<=days){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;

    }
}

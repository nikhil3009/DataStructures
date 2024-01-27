package BinarySearch;

public class Min_Max_Cows_MagneticForces {
    public boolean cowDistance(int[] position, int distance, int m){
        int count = 1;
        int last = position[0];
        for(int i = 1;i<position.length;i++){
            if(position[i]-last>=distance){
                count++;
                last = position[i];

            }
            if(count>=m){
                return true;
            }

        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int low = 1; int high = position[n-1] - position[0];
        while(low<=high){
            int mid = low+(high-low)/2;
            if(cowDistance(position,mid,m) == true){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high;

    }
}

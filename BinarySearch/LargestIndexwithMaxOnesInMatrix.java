package BinarySearch;

public class LargestIndexwithMaxOnesInMatrix {

    public static int lowerBound(ArrayList<Integer> arr, int n, int k){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr.get(mid)>= k){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int maxCount = 0;
        int index = -1;
        for(int i = 0; i<n;i++){
            int count =m-lowerBound(matrix.get(i),m,1);
            if(count>maxCount){
                maxCount = count;
                index = i;
            }
        }
        return index;
    }
}

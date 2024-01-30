package BinarySearch;

public class KthElementTwoSOrtedArrays {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        if(n>m){
            return kthElement(arr2,arr1,m,n,k);
        }
        int low = Math.max(0,k-m);
        int high = Math.min(k,n);
        while(low<=high){
            int mid1 = (low+high)/2;
            int mid2 = k - mid1;
            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1.get(mid1 - 1);
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2.get(mid2 - 1);
            int r1 = (mid1 == n) ? Integer.MAX_VALUE : arr1.get(mid1);
            int r2 = (mid2 == m) ? Integer.MAX_VALUE : arr2.get(mid2);
            if(l1<=r2 && l2<= r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                high = mid1-1;
            }
            else{
                low = mid1+1;
            }
        }

        return 0;
    }
}

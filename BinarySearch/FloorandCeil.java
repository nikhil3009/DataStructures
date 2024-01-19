package BinarySearch;

public class FloorandCeil {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int[] ans = new int[2];
        int floor = getFloor(a,n,x);
        int ceil = getCeil(a,n,x);
        ans[0] = floor;
        ans[1] = ceil;
        return ans;
    }
    public static int getFloor(int[] a, int n, int x){
        int start = 0;
        int end = n-1;
        int anfloor = -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid]<=x){
                anfloor = a[mid];
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return anfloor;
    }
    public static int getCeil(int[] a, int n, int x){
        int start = 0;
        int end = n-1;
        int anceil = -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid]>=x){
                anceil = a[mid];
                end = mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return anceil;
    }
}

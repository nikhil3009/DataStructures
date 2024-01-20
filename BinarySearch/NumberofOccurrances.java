package BinarySearch;

public class NumberofOccurrances {
    public static int count(int arr[], int n, int x) {
        int[] ans = searchRange(arr,n,x);
        if(ans[0] == -1){
            return 0;
        }
        return(ans[1]-ans[0]+1);
    }
    public static int[] searchRange(int[] arr, int n, int x) {
        int first = searchFirst(arr,n,x);
        if(first == -1) return new int[] {-1,-1};
        int last = searchLast(arr,n,x);
        return new int[] {first,last};
    }
    public static int searchFirst(int[] arr,int n, int x){
        int start = 0 ;
        int end = n-1;
        int ansF = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==x){
                ansF = mid;
                end = mid-1;
            }
            else if(arr[mid]<x){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ansF;
    }
    public static int searchLast(int[] arr,int n,int x){

        int start = 0 ;
        int end = n-1;
        int ansL = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==x){
                ansL = mid;
                start = mid+1;
            }
            else if(arr[mid]<x){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ansL;
    }
}

package BinarySearch;

public class AllocateBooks {
    public class Solution {
        public static int calculatePages(ArrayList<Integer> arr, int n,int mid){
            int pages = 0;
            int students = 1;
            for(int i = 0; i<n;i++){
                if(arr.get(i)+pages<=mid){
                    pages+=arr.get(i);
                }
                else{
                    students++;
                    pages = arr.get(i);
                }
            }
            return students;
        }
        public static int findPages(ArrayList<Integer> arr, int n, int m) {
            if(m>n){
                return -1;
            }
            int low= 0;
            int high =0;
            int max = 0;
            int sum = 0;
            for(int i = 0;i<n;i++){
                sum+=arr.get(i);
                if(max<arr.get(i)){
                    max = arr.get(i);
                }
            }
            low = max;
            high = sum;
            while(low<=high){
                int mid = low+(high-low)/2;
                int minPages = calculatePages(arr,n,mid);
                if(minPages > m){

                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }

            return low;
        }
}

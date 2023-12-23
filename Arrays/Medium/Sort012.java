package Arrays.Medium;

import java.util.*;

public class Sort012
{ public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
    static void sortArray(ArrayList<Integer> arr, int n){
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr.get(mid) == 0){
                int temp = arr.get(low);
                arr.set(low,arr.get(mid));
                arr.set(mid,temp);
                mid++;
                low++;
            }
            else if(arr.get(mid) == 1){
                mid++;
            }
            else{
                int temp = arr.get(mid);
                arr.set(mid,arr.get(high));
                arr.set(high,temp);
                high--;
            }
        }
    }
}

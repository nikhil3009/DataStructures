package sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {13, 20, 54, 55, 9, 10};
        merge_sort(arr,0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high ){
            if(arr[left]<arr[right]){
                    temp.add(arr[left]);
                    left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        Integer[] temparr = temp.toArray(new Integer[0]);
        for(int i =low;i<= high; i++){
            arr[i] = temparr[i-low];
        }
    }
    static void merge_sort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        merge_sort(arr,low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
}

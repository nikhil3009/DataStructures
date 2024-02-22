package Recursion;

import java.util.ArrayList;

public class Mergesort {
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
}

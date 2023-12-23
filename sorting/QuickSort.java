package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {13, 20, 54, 55, 9, 10};
        quick_sort(arr,0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void quick_sort(int[] arr,int low, int high){
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            quick_sort(arr,low,partitionIndex);
            quick_sort(arr,partitionIndex+1,high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low+1;
        int j = high;
        while(i<=j){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while(j>low && arr[j] > pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    static void swap(int[] arr, int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

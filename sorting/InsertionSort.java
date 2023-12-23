package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {13, 20, 54, 5, 9, 99};
        insertion_sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n-1; i++) {
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--;
            }
        }
    }
}


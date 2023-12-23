package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {13, 20, 54, 55, 90, 99};
        bubble_sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubble_sort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }

        }
    }
}

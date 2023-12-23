package sorting;

public class SortingRev {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {13, 20, 54, 55, 90, 99};
        //bubble_sort(arr, n);
        //insertion_sort(arr, n);
        selection_sort(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void bubble_sort(int[] arr, int n){
        for(int i = n-1;i>=0;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                return;
            }
        }
    }
    static void insertion_sort(int[] arr,int n){
        for(int i =0;i<=n-2;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    static void selection_sort(int[] arr, int n){
        for(int i = 0; i<=n-1; i++){
            int min = i;
            for(int j = i; j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }
}

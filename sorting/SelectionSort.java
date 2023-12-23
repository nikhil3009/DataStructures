package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int n =6;
        int arr[] ={13,20,54,25,9,99};
        selection_sort(arr,n);
        for(int i =0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void selection_sort(int[] arr, int n){
        for(int i =0;i<=n-2;i++){
            int min = i;
            for(int j = i;j<=n-1;j++){
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

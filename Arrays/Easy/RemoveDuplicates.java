package Arrays.Easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,3};
        int n = 9;
        System.out.println(duplicate(arr,n));
    }
    static int duplicate(int[] arr, int n){
        int i = 0;
        for(int j = 1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}

package Arrays.Easy;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {3,4,1,5,4};
        int n = 5;
        int largest = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}

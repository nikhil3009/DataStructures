package Arrays.Easy;

public class IfArraySorted {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,5};
        int n = 6;
        System.out.println(isSorted(arr,n));

    }
    public static boolean isSorted(int[] arr, int n){
        for(int i =1;i<n;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
}

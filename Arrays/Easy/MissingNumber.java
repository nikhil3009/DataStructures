package Arrays.Easy;

import java.util.ArrayList;

public class MissingNumber {
    public static void main(String args[]) {
        int n = 5;
        int arr1[] = {1, 2, 3, 5};

       int result = missingNumber(arr1, n);
        System.out.println(result);

    }
    public static int missingNumber(int[] arr, int n){
        int sum = n*(n+1)/2;
        int sum2 = 0;
        for(int i = 0; i< arr.length;i++){
            sum2 = sum2 + arr[i];
        }
        return sum - sum2;
    }
}


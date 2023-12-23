package Arrays.Easy;

public class MissingNumberUsingXor {
    public static void main(String args[]) {
        int n = 5;
        int arr1[] = {1, 2, 3, 5};

        int result = missingNumber(arr1, n);
        System.out.println(result);

    }
    public static int missingNumber(int[] arr, int n){
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i< arr.length;i++){
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i+1);
        }
        xor2 = xor2 ^ n;
        return xor2 ^ xor1;
    }
}

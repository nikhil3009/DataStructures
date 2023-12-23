package Arrays.Easy;

public class FindTheNumberWhichAppearOnceWhereOthersAppearTwice {
    public static void main(String args[]) {
        int arr1[] = {1,1,2,2,3,4,4,5,5};

        int result = once(arr1);
        System.out.println(result);
    }
    public static int once(int[] arr){
        int xor = 0;
        for(int i =0;i< arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
}

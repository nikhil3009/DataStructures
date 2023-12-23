package Arrays.Easy;
import java.util.*;



public class ConsecutiveOnes {
    public static void main(String args[]) {
        int arr1[] = {1, 1, 0, 0,1,1,1,1,1,0,0,1,1,0};

        int result = consecutiveOnes(arr1);
        System.out.println(result);

    }
    public static int consecutiveOnes(int[] arr){
        int count = 0;
        int max = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            max = Math.max(max,count);

        }
        return max;
    }
}

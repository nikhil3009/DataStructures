package LeetCode_CodeNinjas;
import java.util.*;
//https://www.codingninjas.com/studio/problems/sort-an-array-of-0s-1s-and-2s_892977?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class Arrayzero_one_two_s {
    public static void sortArray(ArrayList<Integer> nums, int n) {
        int low =0; int mid = 0; int high = nums.size()-1;
        while(mid<=high){
            if(nums.get(mid) == 0){
                int temp = nums.get(low);
                nums.set(low,nums.get(mid));
                nums.set(mid,temp);
                low++;
                mid++;

            }
            else if(nums.get(mid) == 1){
                mid++;

            }
            else{
                int temp = nums.get(mid);
                nums.set(mid,nums.get(high));
                nums.set(high,temp);
                high--;

            }
        }
    }
}

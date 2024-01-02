package LeetCode_CodeNinjas;

public class MajorityElement {int count = 0;
    int n = nums.length;
    int el = 0;
        for(int i = 0;i<n;i++){
        if(count == 0){
            count = 1;
            el = nums[i];
        }
        else if(nums[i] == el){
            count++;
        }
        else{
            count--;
        }
    }
    int actualCount = 0;
        for(int i =0;i<n;i++){
        if(nums[i] == el){
            actualCount++;
        }
    }
        if(actualCount>n/2){
        return el;
    }
        return -1;
}

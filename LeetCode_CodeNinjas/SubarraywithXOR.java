package LeetCode_CodeNinjas;

public class SubarraywithXOR {
    int n = a.length;
    int count =0;
        for(int i = 0;i<n;i++){
        int xor = 0;
        for(int j = i;j<n;j++){
            xor = xor ^ a[j];
            if(xor == b){
                count++;
            }
        }
    }
        return count;
}


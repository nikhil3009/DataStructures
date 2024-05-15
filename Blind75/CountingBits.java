package Blind75;

public class CountingBits {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        int ofset = 1;

        for(int i=1;i<=n;i++){
            if(ofset*2 ==i){
                ofset = i;
            }
            ans[i] = 1 + ans[i-ofset];
        }
        return ans;
    }
}

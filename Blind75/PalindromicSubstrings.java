package Blind75;

public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int n = s.length();
        if(n<2){
            return n;
        }
        int res = 0;
        for(int i=0;i<n;i++){
            int l=i;
            int r =i;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                res++;
                l--;
                r++;
            }
            l = i;
            r=i+1;
            while(l>=0 && r<n&& s.charAt(l) == s.charAt(r)){
                res++;
                l--;
                r++;
            }

        }
        return res;

    }
}

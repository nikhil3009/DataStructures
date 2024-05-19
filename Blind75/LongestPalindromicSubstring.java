package Blind75;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<2){
            return s;
        }
        int res = 0;
        String ans ="";
        for(int i=0;i<n;i++){
            int l=i;
            int r =i;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                if(r-l+1>res){
                    ans = s.substring(l,r+1);
                    res = r-l+1;
                }
                l--;
                r++;
            }
            l = i;
            r=i+1;
            while(l>=0 && r<n&& s.charAt(l) == s.charAt(r)){
                if(r-l+1>res){
                    ans = s.substring(l,r+1);
                    res = r-l+1;
                }
                l--;
                r++;
            }

        }
        return ans;

    }
}

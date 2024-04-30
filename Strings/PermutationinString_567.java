package Strings;

public class PermutationinString_567 {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m){
            return false;
        }
        int freq1[] = new int[26];
        for(int i=0;i<n;i++){
            freq1[s1.charAt(i)-'a'] +=1;
        }

        int freq2[] = new int[26];

        for(int j=0;j<m;j++){
            freq2[s2.charAt(j)-'a'] +=1;
            if(j>=n){
                freq2[s2.charAt(j-n) -'a'] -=1;
            }
            if(Arrays.equals(freq1,freq2)){
                return true;
            }

        }
        return false;

    }
}

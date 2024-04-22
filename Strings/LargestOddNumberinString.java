package Strings;

public class LargestOddNumberinString {
    public String largestOddNumber(String num) {
        String ans ="";
        int max = -1;
        int check = Integer.parseInt(num);
        if(check % 2 !=0){
            return Integer.toString(check);
        }
        for(int i=0;i<num.length();i++){
            int n = num.charAt(i) - '0';
            if(n>max && n%2 !=0){
                max = n;
            }
        }
        if(max == -1){
            return ans;
        }
        else{
            ans = Integer.toString(max);
        }
        return ans;

    }
}

public class palindrome {
    public static void main(String[] args) {
        int n = 3010;

        System.out.println(reverse(n));
    }
    public static boolean reverse(int n){
        int cp = n;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        if(rev == cp){
            return true;
        }
        else{
            return false;
        }
    }

}

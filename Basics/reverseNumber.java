public class reverseNumber
{
    public static void main(String[] args) {
        int n = 3010;
        System.out.println(reverse(n));
    }
    public static int reverse(int n){
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        return rev;
    }
}

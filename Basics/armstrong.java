public class armstrong
{
    public static void main(String[] args) {
        int n = 371;
        System.out.println(armstrong(n));
    }
    public static boolean armstrong(int n){
        int sum = 0;
        int cp =n;
        while(n>0){
            int rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        if(cp == sum){
            return true;
        }
        return false;

    }
}

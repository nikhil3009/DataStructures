public class primeNumber
{
    public static void main(String[] args) {
        int n = 3;
        System.out.println(prime(n));
    }
    public static boolean prime(int n){
        int count = 0;
        for(int i =1; i<=Math.sqrt(n); i++){
            if(n%i == 0) {
                count = count+1;
                if ((n / i) != i) {
                    count = count+1;
                }
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }
}

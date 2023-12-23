public class Prime
{
    public static void main(String[] args){
        System.out.println(isprime(5));
    }
    public static int isprime(long n){
        if(n==1){
            return 0;
        }
        for(long i =2; i*i<=n;i++){
            if(n%i==0){
                return 0;
            }

        }
        return 1;
    }
}

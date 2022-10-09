public class PerfectSquare
{
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(25));
    }
    public static int isPerfectSquare(int n){
        int ans = -1;
        int i = 1;
        while(i*i<=n){
            if(i*i==n){
                ans = i;
            }
            i = i+1;
        }
        return ans;
    }
}

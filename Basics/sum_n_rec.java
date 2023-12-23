public class sum_n_rec
{
    public static void main(String[] args) {
        int n =7;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
}

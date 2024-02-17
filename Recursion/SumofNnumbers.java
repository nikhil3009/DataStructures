package Recursion;

public class SumofNnumbers {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
}

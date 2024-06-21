package Recursion;

public class PowSum {
    public double myPow(double x, int n) {
        double ans = 1.0;
        double i = n;
        if(i<0){
            i = i * (-1);
        }
        while(i>0){
            if(i%2 == 0){
                x = x*x;
                i = i/2;
            }
            else{
                ans = ans * x;
                i = i-1;
            }
        }
        if(n<0){
            ans = (double)(1.0) / (double) (ans);
        }
        return ans;
    }
}

 import java.util.*;

 import static java.lang.Math.log10;

 public class countNUmber
{
    public static void main(String[] args) {
        int n = 3009;
        System.out.println(count(n));
        System.out.println(count2(n));
    }
    public static int count(int n){
        int count =0;
        while(n>0){
            count = count +1;
            n =n/10;
        }
        return count;

    }
    public static int count2(int n){
        int cnt = (int)(log10(n)) +1;
        return cnt;
    }
}

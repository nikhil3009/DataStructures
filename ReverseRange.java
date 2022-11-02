import java.util.Arrays;

public class ReverseRange {
    public static void main(String[] args) {
        int[] a = {5, 4, 1, 6, 10, 8, 9};
        int b = 2;
        int d = 5;
        System.out.println(Arrays.toString(reverseRange(a,b,d)));
    }
    public static int[] reverseRange(int[] ans,int b, int c){
        int i = b;
        int j = c;
        while(i<j){
            int temp = ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
            i++;
            j--;
        }
        return ans;
    }
}

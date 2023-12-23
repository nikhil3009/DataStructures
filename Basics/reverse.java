import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] a = {5, 4, 1, 6, 10, 8, 9};
        System.out.println(Arrays.toString(reverse(a)));
    }
    public static int[] reverse(int[] ans){
        int n = ans.length;
        for(int i =0;i<n/2;i++){
            swap(ans,i,n-1-i);
        }
        return ans;

    }
    public static int[] swap(int[] a,int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
        return a;

    }
}

import java.util.Arrays;

public class SubArray
{
    public static void main(String[] args) {
        int[] a= {4,3,2,6};
        int b =1;
        int c=3;
        System.out.println(Arrays.toString(subArray(a,b,c)));
    }
    public static int[] subArray(int a[], int b, int c){
        int[] res = new int[c-b+1];
        int j = 0;
        for(int i=b;i<=c;i++){
            res[j]=a[i];
            j++;
        }
        return res;
    }
}

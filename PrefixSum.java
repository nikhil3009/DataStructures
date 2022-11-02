import java.util.Arrays;

public class PrefixSum
{
    public static void main(String[] args) {
        int a[] =new int[]{5,4,1,6,3,9,0,2};
        System.out.println(prefix(a,3,6));
        System.out.println(prefix(a,0,7 ));
    }
    public static int prefix(int[] a,int i, int j){
        int n = a.length;
        int[] b = new int[n];
        b[0] = a[0];
        for(int k =1; k<n;k++){
            b[k]=b[k-1]+a[k];
        }
        /*int sum=0;
        for(int l=i;l<j-1;l++){
            sum=sum+b[l];
        }
        return sum;*/
        if(i==0){
            return b[j];
        }
        else {
            return b[j]-b[i-1];
        }

    }

}

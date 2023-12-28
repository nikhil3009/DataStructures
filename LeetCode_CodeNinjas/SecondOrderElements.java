package LeetCode_CodeNinjas;

public class SecondOrderElements {
    public static int[] getSecondOrderElements(int n, int []a) {
        int sSecondlargest = getSecondLargest(n,a);
        int sSecondsmallest  = getSecondSmallest(n,a);
        return new int[]{sSecondlargest,sSecondsmallest};
    }
    public static int getSecondLargest(int n , int[]a){
        int largest = a[0];
        int slargest = Integer.MIN_VALUE;
        for(int i =1;i<n;i++){
            if(a[i]>largest){
                slargest = largest;
                largest = a[i];
            }
            else if(a[i]<largest && a[i]>slargest){
                slargest = a[i];
            }
        }
        return slargest;
    }
    public static int getSecondSmallest(int n , int[]a){
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i =1;i<n;i++){
            if(a[i]<smallest){
                ssmallest = smallest;
                smallest = a[i];
            }
            else if(a[i]!=smallest && a[i]<ssmallest){
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }
}

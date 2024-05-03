package Revision.Arrays;

public class FindSecondLarget {
    public static int getSecondLargest(int n , int[]a){
        int largest = a[0];
        int sLargest = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]>largest){
                sLargest = largest;
                largest = a[i];
            }
            else if(a[i]<largest && a[i]>sLargest){
                sLargest = a[i];
            }
        }
        return sLargest;
    }
}

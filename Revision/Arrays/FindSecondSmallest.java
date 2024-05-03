package Revision.Arrays;

public class FindSecondSmallest
{
    public static int getSecondSmallest(int n , int[]a){
        int smallest = a[0];
        int slest = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]<smallest){
                slest = smallest;
                smallest = a[i];
            }
            else if(a[i]>smallest && a[i]<slest){
                slest = a[i];
            }
        }
        return slest;
    }
}

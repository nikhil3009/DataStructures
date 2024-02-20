package Recursion;

public class CheckSubsetsofSUmK {
    public static boolean isSubsetPresent(int n, int k,int []a) {
        return generateSubsets(a,0,0,k);
    }
    public static boolean generateSubsets(int[] a, int index, int currentSum, int k){
        if(index == a.length){

            return currentSum == k;
        }

        if(generateSubsets(a,index+1,a[index]+currentSum,k)){
            return true;
        }

        if(generateSubsets(a,index+1,currentSum,k)){
            return true;
        }
        return false;
    }
}

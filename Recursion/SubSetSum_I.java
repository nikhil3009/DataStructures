package Recursion;

public class SubSetSum_I {
    public static ArrayList<Integer> subsetSum(int num[]) {
        int n = num.length;
        ArrayList<Integer> result = new ArrayList<>();
        generateSumSubsets(num,0,0,n,result);
        Collections.sort(result);
        return result;
    }
    public static void generateSumSubsets(int[] num, int index, int sum, int n, ArrayList<Integer> result)
    {
        if(index == n){
            result.add(sum);
            return;
        }
        generateSumSubsets(num,index+1,sum+num[index],n,result);
        generateSumSubsets(num,index+1,sum,n,result);

    }
}

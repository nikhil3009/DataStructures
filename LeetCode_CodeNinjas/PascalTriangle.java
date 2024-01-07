package LeetCode_CodeNinjas;
import java.util.*;
public class PascalTriangle {
    public List<Integer> generateRow(int n){

        List<Integer> rowAns = new ArrayList<>();
        rowAns.add(1);
        int res =1;
        for(int i = 1;i<n;i++){
            res = res*(n-i);
            res = res/i;
            rowAns.add((int)res);
        }
        return rowAns;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1;i<=numRows;i++){
            ans.add(generateRow(i));

        }
        return ans;

    }
}

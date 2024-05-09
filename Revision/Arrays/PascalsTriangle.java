package Revision.Arrays;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> cans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            cans.add(generateRows(i));
        }
        return cans;
    }
    public List<Integer> generateRows(int row){
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        long res = 1;
        for(int i=1;i<row;i++){
            res = res*(row-i);
            res = res/i;
            ans.add((int)res);
        }
        return ans;
    }
}

package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralArray {
    public static void main(String[] args) {

        //Matrix initialization.
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        List<Integer> ans = printSpiral(matrix);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
    public static List<Integer> printSpiral(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        while(top<=bottom && left<= right){
            //left to right
            for(int i = left; i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //top to bottom
            for(int i = top; i<=bottom;i++ ){
                ans.add(matrix[i][right]);
            }
            right--;
            //right to left
            if(top<=bottom){
                for(int i =right;i>=left;i-- ){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //bottom to top
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;

    }
    }



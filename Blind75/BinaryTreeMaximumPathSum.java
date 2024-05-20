package Blind75;

public class BinaryTreeMaximumPathSum {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        maxSum(root,max);
        return max[0];

    }
    public int maxSum(TreeNode root,int[] max){
        if(root == null){
            return 0;
        }
        int ls = Math.max(0,maxSum(root.left,max));
        int rs = Math.max(0,maxSum(root.right,max));
        max[0] = Math.max(max[0],root.val+ls+rs);
        return root.val+Math.max(ls,rs);
    }
}

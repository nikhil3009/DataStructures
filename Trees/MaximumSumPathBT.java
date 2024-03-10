package Trees;

public class MaximumSumPathBT
{
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        calculateSum(root,max);
        return max[0];
    }
    public int calculateSum(TreeNode root,int[] max){
        if(root == null){
            return 0;
        }
        int lh = Math.max(0,calculateSum(root.left,max));
        int rh = Math.max(0,calculateSum(root.right,max));
        max[0] = Math.max(max[0],lh+rh+root.val);
        return root.val+Math.max(lh,rh);
    }
}

package Trees;

public class DiameterOfBT {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        calHeight(root,diameter);

        return diameter[0];
    }
    public int calHeight(TreeNode root,int[] diameter )
    {
        if(root == null){
            return 0;
        }
        int lh = calHeight(root.left,diameter);
        int rh = calHeight(root.right,diameter);
        diameter[0] = Math.max(diameter[0],lh+rh);
        return 1+Math.max(lh,rh);

    }
}

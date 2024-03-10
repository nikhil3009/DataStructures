package Trees;

public class CheckbalancedBT {
    public boolean isBalanced(TreeNode root) {
        return (calHeight(root) != -1);

    }
    public int calHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = calHeight(root.left);
        if(lh == -1){
            return -1;
        }
        int rh = calHeight(root.right);
        if(rh == -1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return Math.max(lh,rh)+1;
    }
}

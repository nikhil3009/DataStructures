package Blind75;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        Long min = Long.MIN_VALUE;
        Long max = Long.MAX_VALUE;
        return check(root,min,max);

    }
    public boolean check(TreeNode root,long min,long max){
        if(root == null){
            return true;
        }
        if(root.val <= min || root.val >= max){
            return false;
        }
        return check(root.left,min,root.val)&& check(root.right,root.val,max);
    }
}

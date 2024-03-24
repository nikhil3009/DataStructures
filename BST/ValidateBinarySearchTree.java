package BST;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        Long minVal = Long.MIN_VALUE;
        Long maxVal = Long.MAX_VALUE;
        return checkBST(root,minVal,maxVal);
    }
    public boolean checkBST(TreeNode root,long minVal,long maxVal){
        if(root == null){
            return true;
        }
        if(root.val>= maxVal || root.val <= minVal){
            return false;
        }
        return checkBST(root.left,minVal,root.val) && checkBST(root.right,root.val,maxVal);
    }
}

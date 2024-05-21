package Blind75;

public class KthSmallestElementBST {
    int count = 0;
    int result  = Integer.MAX_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }
    public void inorder(TreeNode root, int k){
        if(root == null){
            return;
        }
        inorder(root.left,k);
        count++;
        if(k == count){
            result = root.val;
        }
        inorder(root.right,k);
    }
}

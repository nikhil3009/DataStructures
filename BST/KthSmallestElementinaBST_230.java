package BST;

public class KthSmallestElementinaBST_230 {
    int cnt  = 0;
    int result = Integer.MIN_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return result;
    }
    public void inorder(TreeNode root, int k){
        if(root == null){
            return;
        }
        inorder(root.left,k);
        cnt = cnt+1;
        if(cnt == k){
            result = root.val;
            return;
        }
        inorder(root.right,k);
    }
}

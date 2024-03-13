package Trees;

public class RootEqualsSumofChildren_2236
{
    public boolean checkTree(TreeNode root) {
        if(root == null || root.left == null && root.right == null){
            return true;
        }
        int val = 0;
        if(root.left!=null){val += root.left.val;}
        if(root.right!=null){val += root.right.val;}
        boolean check = (val == root.val);
        return check && checkTree(root.left) && checkTree(root.right);
    }
}

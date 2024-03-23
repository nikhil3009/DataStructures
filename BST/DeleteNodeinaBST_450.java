package BST;

public class DeleteNodeinaBST_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }
        if(root.val == key){
            return helper(root);
        }

        TreeNode temp = root;
        while(root!=null){
            if(key<root.val){
                if(root.left!=null && root.left.val == key){
                    root.left = helper(root.left);
                    break;
                }
                else{
                    root = root.left;
                }
            }
            else{
                if(root.right != null && root.right.val == key){
                    root.right = helper(root.right);
                    break;
                }
                else{
                    root = root.right;
                }
            }
        }
        return temp;
    }
    public TreeNode helper(TreeNode root){
        if(root.left == null){
            return root.right;
        }
        if(root.right == null){
            return root.left;
        }
        TreeNode rightChild = root.right;
        TreeNode rightMost = findR(root.left);
        rightMost.right = rightChild;
        return root.left;

    }
    public TreeNode findR(TreeNode root){
        if(root.right == null){
            return root;
        }
        return findR(root.right);
    }

}

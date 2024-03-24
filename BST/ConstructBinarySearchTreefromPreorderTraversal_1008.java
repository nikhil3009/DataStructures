package BST;

public class ConstructBinarySearchTreefromPreorderTraversal_1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder,Integer.MAX_VALUE,new int[]{0});

    }
    public TreeNode build(int[] preorder, int bound, int[] i){
        if(i[0] == preorder.length || preorder[i[0]] > bound ){
            return null;
        }
        TreeNode root = new TreeNode(preorder[i[0]]);
        i[0] = i[0] +1;
        root.left = build(preorder,root.val,i);
        root.right = build(preorder,bound,i);
        return root;
    }
}

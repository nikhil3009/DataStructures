package Trees;

public class BinaryTreefromPostInorder_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0;i<inorder.length;i++){
            mpp.put(inorder[i],i);
        }
        TreeNode root = build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,mpp);
        return root;

    }
    public TreeNode build(int[] postorder,int pos,int poend, int[] inorder,int inst,int inend,Map<Integer,Integer> mpp){
        if(pos>poend || inst>inend ){
            return null;
        }
        TreeNode root = new TreeNode(postorder[poend]);
        int index = mpp.get(root.val);
        int numsLeft = index-inst;
        root.left=build(postorder,pos,pos+numsLeft-1,inorder,inst,index-1,mpp);
        root.right=build(postorder,pos+numsLeft,poend-1,inorder,index+1,inend,mpp);
        return root;
    }
}

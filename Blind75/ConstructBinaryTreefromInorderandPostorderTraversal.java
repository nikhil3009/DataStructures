package Blind75;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length != postorder.length){
            return null;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        TreeNode root = build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,hm);
        return root;
    }
    public TreeNode build(int[] postorder, int ps, int pe,int[] inorder,int is,int ie, HashMap<Integer,Integer> hm)
    {
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode root = new TreeNode(postorder[pe]);
        int index =  hm.get(root.val);
        int nleft  = index - is;
        root.left = build(postorder,ps,ps+nleft-1,inorder,is,index-1,hm);
        root.right = build(postorder,ps+nleft,pe-1,inorder,index+1,ie,hm);
        return root;
    }
}

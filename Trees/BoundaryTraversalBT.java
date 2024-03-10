package Trees;

public class BoundaryTraversalBT {

    public static Boolean isLeaf(TreeNode root) {
        return (root.left == null) && (root.right == null);
    }
    public static void leftBoundary(TreeNode root,List<Integer> ans){
        TreeNode cur = root.left;
        while(cur!=null){
            if(isLeaf(cur) == false){
                ans.add(cur.data);
            }
            if(cur.left!=null){
                cur = cur.left;
            }
            else{
                cur = cur.right;
            }
        }
    }
    public static void leaf(TreeNode root,List<Integer> ans){
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        if(root.left!=null){
            leaf(root.left,ans);
        }
        if(root.right!=null){
            leaf(root.right,ans);
        }

    }
    public static void rightBoundary(TreeNode root,List<Integer> ans){
        List<Integer> temp = new ArrayList<>();
        TreeNode cur = root.right;
        while(cur!=null){
            if(isLeaf(cur) == false){
                temp.add(cur.data);
            }
            if(cur.right!=null){
                cur = cur.right;
            }
            else{
                cur = cur.left;
            }
        }
        for(int i = temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));
        }
    }
    public static List<Integer> traverseBoundary(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(isLeaf(root) == false){
            ans.add(root.data);
        }
        leftBoundary(root,ans);
        leaf(root,ans);
        rightBoundary(root,ans);
        return ans;
    }
}

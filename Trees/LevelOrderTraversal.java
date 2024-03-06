package Trees;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> temp = new LinkedList<>();
        if(root == null){
            return ans;
        }
        temp.add(root);
        while(!temp.isEmpty()){
            int n = temp.size();
            List<Integer> current = new ArrayList<>();
            for(int i = 0; i<n;i++){
                TreeNode cur = temp.poll();
                current.add(cur.val);
                if(cur.left!=null){
                    temp.add(cur.left);
                }
                if(cur.right!=null){
                    temp.add(cur.right);
                }
            }
            ans.add(current);

        }
        return ans;
    }
}

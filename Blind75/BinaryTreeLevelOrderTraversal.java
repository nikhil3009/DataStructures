package Blind75;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> cur = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp = q.poll();
                cur.add(temp.val);
                if(temp.left !=null){
                    q.add(temp.left);
                }
                if(temp.right !=null){
                    q.add(temp.right);
                }
            }
            ans.add(cur);
        }
        return ans;

    }
}

package Trees;

public class MaxWidthBT {
    class Pair{
        int num;
        TreeNode node;
        Pair(TreeNode node,int num){
            this.node = node;
            this.num = num;

        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 0;
        Queue<Pair> q = new LinkedList<Pair>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int first = 0;
            int last = 0;
            int carry = q.peek().num;
            int size = q.size();
            for(int i = 0;i<size;i++){
                int curId = q.peek().num-carry;
                TreeNode node = q.peek().node;
                q.poll();
                if(i == 0){
                    first = curId;
                }
                if(i == size-1){
                    last = curId;
                }
                if(node.left!=null){
                    q.offer(new Pair(node.left,2*curId+1));
                }
                if(node.right!=null){
                    q.offer(new Pair(node.right,2*curId+2));
                }


            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}

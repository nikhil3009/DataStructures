package Trees;

public class BottomViewBT {
    static class Pair{
        TreeNode root;
        int hd;
        Pair(TreeNode root,int hd){
            this.root = root;
            this.hd = hd;
        }
    }
    public static List<Integer> bottomView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Map<Integer,Integer> mpp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            TreeNode node = it.root;
            int hd = it.hd;
            mpp.put(hd,node.val);
            if(node.left!=null){
                q.add(new Pair(node.left,hd-1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;

    }
}

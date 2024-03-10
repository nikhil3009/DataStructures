package Trees;

public class TopViewofBT {

    static class Pair{
        TreeNode node;
        int hd;
        Pair(TreeNode node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static List<Integer> getTopView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Map<Integer,Integer> mpp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            TreeNode node = it.node;
            if(mpp.get(hd) == null){
                mpp.put(hd,node.data);
            }
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

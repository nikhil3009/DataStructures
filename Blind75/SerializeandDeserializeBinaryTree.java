package Blind75;

public class SerializeandDeserializeBinaryTree {
    private int i;

    public String serialize(TreeNode root) {
        List<String> temp = new ArrayList<>();
        dfsSerialize(root,temp);
        return String.join(",",temp);
    }
    public void dfsSerialize(TreeNode root,List<String> temp){
        if(root == null){
            temp.add("N");
            return;
        }
        temp.add(String.valueOf(root.val));
        dfsSerialize(root.left,temp);
        dfsSerialize(root.right,temp);
    }

    public TreeNode deserialize(String data) {
        String[] tokens = data.split(",");
        return dfsDeserialize(tokens);
    }
    public TreeNode dfsDeserialize(String[] tokens){
        String token = tokens[this.i];
        if(token.equals("N")){
            this.i++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(token));
        this.i++;
        root.left = dfsDeserialize(tokens);
        root.right = dfsDeserialize(tokens);
        return root;
    }
}

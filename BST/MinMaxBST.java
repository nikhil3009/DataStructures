package BST;

public class MinMaxBST {
    public static int minValue(Node root) {
        if(root == null){
            return -1;
        }
        while(root.left!=null){
            root = root.left;
        }
        return root.data;
    }
    public static int maxValue(Node root) {
        if(root == null){
            return -1;
        }
        while(root.right!=null){
            root = root.right;
        }
        return root.data;
    }
}

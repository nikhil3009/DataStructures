package BST;

public class FindCeil {
    public  static int findCeil(TreeNode<Integer> node, int x) {

        int ceil = -1;
        while(node!=null){
            if(x == node.data){
                ceil = node.data;
                return ceil;
            }
            if(x>node.data){
                node = node.right;
            }
            else{
                ceil = node.data;
                node = node.left;

            }
        }
        return ceil;

    }
}

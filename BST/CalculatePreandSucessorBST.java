package BST;

public class CalculatePreandSucessorBST {
    public static List<Integer> predecessorSuccessor(TreeNode root, int key) {
        int pre = calPre(root,key);
        int suc = calSuc(root,key);
        List<Integer> ans = Arrays.asList(pre, suc);
        return ans;
    }
    public static int calPre(TreeNode root, int key){
        if(root == null){
            return -1;
        }
        int temp =Integer.MIN_VALUE;
        while(root!=null){
            if(key<=root.data){
                root = root.left;
            }
            else{
                temp = root.data;
                root = root.right;
            }
        }
        return temp;
    }
    public static int calSuc(TreeNode root, int key){
        if(root == null){
            return -1;
        }
        int temp = Integer.MAX_VALUE;
        while(root!=null){
            if(key>=root.data){
                root = root.right;
            }
            else{
                temp = root.data;
                root = root.left;
            }
        }
        return temp;
    }
}

package Trees;

public class CountCompleteTreeNodes_222 {
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = calculateHeightLeft(root);
        int right = calculateHeightRight(root);

        if(left == right){
            return (int)(Math.pow(2,left)-1);
        }
        else{
            return countNodes(root.left) + countNodes(root.right) +1;
        }

    }
    public int calculateHeightLeft(TreeNode root){
        int count = 0;

        while(root!=null){
            count = count+1;
            root = root.left;
        }
        return count;
    }
    public int calculateHeightRight(TreeNode root){
        int count = 0;

        while(root!=null){
            count = count+1;
            root = root.right;

        }
        return count;
    }
}

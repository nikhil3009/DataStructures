package Trees;

public class LeftViewBT {
    public static void printLeftView(TreeNode<Integer> root) {
        List<Integer> ans = new ArrayList<>();
        leftView(root,0,ans);
        for(int i = 0; i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static void leftView(TreeNode<Integer> root, int level,List<Integer> ans){
        if(root == null){
            return;
        }
        if(level == ans.size()){
            ans.add(root.data);
        }
        leftView(root.left,level+1,ans);
        leftView(root.right,level+1,ans);

    }
}

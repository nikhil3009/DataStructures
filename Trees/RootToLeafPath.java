package Trees;

public class RootToLeafPath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        int[] path = new int[1000];
        getPaths(root,path,0,ans);
        return ans;
    }
    public void getPaths(TreeNode root,int[] path,int level,List<String> ans){
        if(root == null){
            return;
        }
        path[level] = root.val;
        level = level+1;
        if(root.left == null && root.right==null){
            ans.add(build(path,level));
        }
        getPaths(root.left,path,level,ans);
        getPaths(root.right,path,level,ans);
    }
    public String build(int[] path , int level){
        StringBuilder fina = new StringBuilder();
        for(int i = 0; i<level;i++){
            fina.append(path[i]);
            if(i<level-1){
                fina.append("->");
            }
        }
        return fina.toString();
    }
}

package Trees;

/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
 int data;
 TreeNode left;
 TreeNode right;
 TreeNode() {
 this.data = 0;
 this.left = null;
 this.right = null;
 }
 TreeNode(int data) {
 this.data = data;
 this.left = null;
 this.right = null;
 }
 TreeNode(int data, TreeNode left, TreeNode right) {
 this.data = data;
 this.left = left;
 this.right = right;
 }
 };
 ********************************************************/

import java.util.*;
class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode _node, int _num){

        node = _node;
        num = _num;
    }
}
public class In_Pre_Post_OrderTraversals {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Pair> st = new Stack<Pair>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        st.push(new Pair(root,1));

        while(!st.isEmpty()){
            Pair temp = st.pop();
            if(temp.num==1){
                pre.add(temp.node.data);
                temp.num++;
                st.push(temp);
                if(temp.node.left!=null){
                    st.push(new Pair(temp.node.left,1));
                }
            }
            else if(temp.num==2){
                in.add(temp.node.data);
                temp.num++;
                st.push(temp);
                if(temp.node.right!=null){
                    st.push(new Pair(temp.node.right,1));
                }
            }
            else{
                post.add(temp.node.data);
            }

        }
        ans.add(in);
        ans.add(pre);

        ans.add(post);
        return ans;
    }
}
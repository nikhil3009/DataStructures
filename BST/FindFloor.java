package BST;

public class FindFloor {
    public static int Floor(BinaryTreeNode<Integer> node, int input) {
    int floor = -1;
    while(node!=null){
        if(input == node.data){
            floor = node.data;
            return floor;
        }
        if(input>node.data){
            floor = node.data;
            node =node.right;
        }
        else{
            node = node.left;
        }
    }
    return floor;
}
}

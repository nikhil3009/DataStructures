package Blind75;

public class CloneGraph {
    private Node clone(Node node, HashMap<Node,Node> mp){
        Node newnode = new Node(node.val);
        mp.put(node,newnode);
        for(Node nei:node.neighbors){
            if(!mp.containsKey(nei)){
                newnode.neighbors.add(clone(nei,mp));
            }
            else{
                newnode.neighbors.add(mp.get(nei));
            }
        }
        return newnode;
    }
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        HashMap<Node,Node> mp = new HashMap<>();
        return clone(node,mp);

    }
}

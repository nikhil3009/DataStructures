package Blind75;

public class CloneGraph {
    public HashMap<Integer,Node> mp= new HashMap<>();
    public Node cloneGraph(Node node) {

        if(node == null){
            return null;
        }
        if(mp.containsKey(node.val)){
            return mp.get(node.val);
        }
        Node newNode = new Node(node.val,new ArrayList<Node>());
        mp.put(node.val,newNode);
        for(Node nei : node.neighbors){
            newNode.neighbors.add(cloneGraph(nei));
        }
        return newNode;

    }
}

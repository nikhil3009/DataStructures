package LinkedLists;


 // Following is the class structure of the Node class:

 class Node {
 public int data;
 public Node next;
 public Node prev;

 Node()
 {
 this.data = 0;
 this.next = null;
 this.prev = null;
 }

 Node(int data)
 {
 this.data = data;
 this.next = null;
 this.prev = null;
 }

 Node(int data, Node next)
 {
 this.data = data;
 this.next = next;
 this.prev = next;
 }
 };

public class InsertNodeAtTheBeggining {
    public static Node insertAtFirst(Node list, int newValue) {
        Node newNode = new Node(newValue);
        newNode.next = list;
        list.prev = newNode;
        return newNode;
    }
}


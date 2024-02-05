package LinkedLists;
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

    Node(int data, Node next, Node prev)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
};
public class InsertionsDLL {
    public static insertBeforeHead(val,head) {
        Node newHead = new Node(val, head, null);
        head.prev = newHead;
        head = newHead;
        return head;
    }
    public static insertAftertail(val,head) {
        Node newTail = new Node(val);
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
        }
        temp.next = newTail;
        newTail.prev = temp;

    }
}

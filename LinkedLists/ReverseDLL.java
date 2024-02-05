package LinkedLists;

public class ReverseDLL {
    public static Node reverseDLL(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }
        Node temp = head;
        Node last = null;
        while(temp!= null){
            last = temp.prev;
            temp.prev = temp.next;
            temp.next = last;
            temp = temp.prev;
        }
        return last.prev;
    }
}

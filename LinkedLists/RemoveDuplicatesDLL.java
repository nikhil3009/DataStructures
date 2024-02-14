package LinkedLists;

public class RemoveDuplicatesDLL {
    public static Node1 uniqueSortedList(Node1 head) {
        Node1 temp = head;
        while (temp != null && temp.next != null) {
            Node1 nextNode = temp.next;
            while (nextNode != null && temp.data == nextNode.data) {
                // Skip the duplicate nodes
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if (nextNode != null) {
                nextNode.prev = temp; // Ensure nextNode is not null before setting prev
            }
            temp = temp.next;
        }
        return head;
    }
}

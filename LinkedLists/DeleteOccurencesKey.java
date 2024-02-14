package LinkedLists;

public class DeleteOccurencesKey {
    public static Node deleteAllOccurrences(Node head, int k) {
        Node temp = head;
        while(temp!=null){
            if(temp.data == k){
                if(temp == head){
                    head = temp.next;
                }
                Node prevNode = temp.prev;
                Node nextNode = temp.next;
                if(prevNode != null){
                    prevNode.next = nextNode;
                }
                if(nextNode != null){
                    nextNode.prev = prevNode;
                }
                temp = nextNode;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}

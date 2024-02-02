package LinkedLists;

public class LengthOfLL {
    public static int length(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;

    }
}

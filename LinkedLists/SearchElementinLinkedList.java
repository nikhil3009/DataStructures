package LinkedLists;

public class SearchElementinLinkedList {
    public static int searchInLinkedList(Node head, int k)
    {
        Node temp = head;
        while(temp!=null){

            if(temp.data == k){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
}

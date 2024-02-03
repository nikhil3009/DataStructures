package LinkedLists;

public class DeleteLastNode {
    public static Node deleteLast(Node list){
        if(list == null || list.next == null){
            return null;
        }
        Node temp = list;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return list;
    }
}

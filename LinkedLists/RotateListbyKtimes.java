package LinkedLists;

public class RotateListbyKtimes {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int length = 1;
        ListNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
            length++;
        }
        k = k%length;
        if(k == 0){
            return head;
        }

        tail.next = head;
        int newtl = length - k;
        ListNode newTail = head;

        for(int i = 1; i<newtl; i++){
            newTail = newTail.next;
        }
        head = newTail.next;
        newTail.next = null;
        return head;
    }
}

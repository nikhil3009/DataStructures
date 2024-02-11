package LinkedLists;

public class DeletemiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast  = head;
        fast = fast.next.next;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // ListNode middle = slow.next;
        slow.next = slow.next.next;
        // middle.next = null;
        return head;

    }
}

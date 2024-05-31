package Revision;

public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middle = slow.next;
        slow.next = null;
        ListNode dummy = null;
        while(middle!=null){
            ListNode front = middle.next;
            middle.next = dummy;
            dummy = middle;
            middle = front;
        }

        ListNode start = head;
        ListNode end = dummy;

        while(end!=null){
            ListNode temp1 = start.next;
            ListNode temp2 = end.next;
            start.next = end;
            end.next = temp1;
            start = temp1;
            end = temp2;
        }


    }
}

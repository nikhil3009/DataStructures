package Blind75;

public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        ListNode dummy = null;
        while(second!=null){
            ListNode front = second.next;
            second.next = dummy;
            dummy = second;
            second = front;
        }
        ListNode first = head;
        second = dummy;
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;



        }


    }
}

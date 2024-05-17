package Blind75;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
            if(fast == null){
                return head.next;
            }
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return head;

    }
}

package LinkedLists;

public class ReverseNodesinKgroup {
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode back = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = back;
            back = temp;
            temp = front;
        }
        return back;
    }
    public ListNode findKthNode(ListNode temp, int k){
        k -= 1;
        while(temp!=null && k>0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;
        while(temp!=null){
            ListNode kthNode = findKthNode(temp,k);
            if(kthNode == null){
                if(prevNode != null){prevNode.next = temp;
                }
                break;
            }
            else{
                ListNode nextNode =  kthNode.next;
                kthNode.next = null;
                reverse(temp);
                if(temp == head){
                    head = kthNode;
                }
                else{
                    prevNode.next = kthNode;
                }
                prevNode = temp;
                temp = nextNode;
            }
        }
        return head;


    }
}

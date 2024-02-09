package LinkedLists;

public class PalindromeLL {
    public static Node reverseLL(Node head){

        Node temp = head;
        Node prev = null;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static boolean isPalindrome(Node head) {
        if(head == null || head.next == null){
            return true;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverseLL(slow.next);
        Node first = head;
        Node second = newHead;
        while(second!= null){
            if(first.data != second.data){
                reverseLL(newHead);
                return false;
            }
            first = first.next;
            second = second.next;

        }
        reverseLL(newHead);
        return true;


    }
}

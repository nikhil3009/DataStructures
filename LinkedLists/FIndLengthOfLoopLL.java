package LinkedLists;

public class FIndLengthOfLoopLL {
    public static int findLen(Node slow, Node fast){
        int count = 1;
        fast = fast.next;
        while(slow!=fast){
            count++;
            fast = fast.next;
        }
        return count;
    }
    public static int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return findLen(slow,fast);
            }
        }
        return 0;
    }

}

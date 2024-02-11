package LinkedLists;

public class Sort012SinLL {
    public static Node sortList(Node head) {
        Node temp = head;
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead  = new Node(-1);
        Node zero = zeroHead;
        Node one  = oneHead;
        Node two  = twoHead;
        while(temp!= null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }
            else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        if(oneHead.next!=null){
            zero.next = oneHead.next;
        }
        else{
            zero.next = twoHead.next;
        }
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }

}

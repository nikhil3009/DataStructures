package LinkedLists;

public class AddOnetoLL {
    public static int helper(Node temp){
        if(temp ==null){
            return 1;
        }
        int carry = helper(temp.next);
        temp.data += carry;
        if(temp.data<10){
            return 0;
        }
        else{
            temp.data = 0;
            return 1;
        }
    }
    public static Node addOne(Node head) {
        Node temp = head;
        int carry = helper(temp);
        if(carry == 1){
            Node newnode = new Node(1);
            newnode.next = head;
            return newnode;
        }
        else{
            return head;
        }
    }
}

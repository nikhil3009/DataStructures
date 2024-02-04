package LinkedLists;
public class Node{
    int val;
    Node next;
    Node prev;

    Node(val){
        this.val = val;
        this.next = null;
        this.prev = null
    }
    Node(val,a,b){
        this.val = val;
        this.next = a;
        this.prev = b;
    }
}
public class ArrayToDLL {
    public static void main(String[] args) {

        Node head = new Node(a[0]);
        Node prev = head;

        for(int i = 1;i<a.length){
            Node temp = new Node(a[i],null,prev;
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

}

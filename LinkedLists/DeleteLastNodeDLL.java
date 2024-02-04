package LinkedLists;

 class Node {
 public int data;
 public Node next;
 public Node prev;

 Node()
 {
 this.data = 0;
 this.next = null;
 this.prev = null;
 }

 Node(int data)
 {
 this.data = data;
 this.next = null;
 this.prev = null;
 }

 Node(int data, Node next, Node prev)
 {
 this.data = data;
 this.next = next;
 this.prev = prev;
 }
 };


public class DeleteLastNodeDLL {
    public static Node deleteLastNode(Node head) {
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
        return head;
    }
    public static Node deleteFirstNode(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node back = head;
        head=head.next;
        head.prev = null;
        back.next = null;
        return head;
    }
    public static Node deleteKthNode(Node head){
      Node temp = head;
      if(head == null || k<=0){
          return null;
      }
      int count = 0;
      while(temp!= null){

          count++;
          temp = temp.next;
          if(count !=1 && count == k && temp.next!=null){
              temp.prev.next = temp.next;
              temp.next.prev = temp.prev;
              temp.prev = null;
              temp.next = null;
              break;
          }
          else if(count == 1 && count == k){
              head= head.next;
              temp.next.prev = null;
              temp.next  = null;

          }
          else{
              temp.prev.next = null;
              temp.prev = null;
          }
      }
      return head;
    }
}

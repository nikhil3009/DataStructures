package LinkedLists;

public class InsertionLL {
    Node temp = head;
    Node prev = null;
    while(temp!=null){

        if(temp.data == k){
            prev.next = prev.next.next;
        }
        prev= temp;
        temp = temp.next;
    }
    return head;

}

Node newnode = new Node(val);
while(temp!=null){
    count++;
    if(count+1 == k){
        newnode.next=temp.next;
        temp.next = newnode;

        break;
        }
    temp = temp.next;
        }

        while(temp!=null){

        if(temp.next.data == k){
        newnode.next=temp.next;
        temp.next = newnode;

        break;
        }
        temp = temp.next;
        }

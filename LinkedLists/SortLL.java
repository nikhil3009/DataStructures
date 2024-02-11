package LinkedLists;

public class SortLL {
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(temp!=null){
            arr.add(temp.val);
            temp =temp.next;
        }
        Collections.sort(arr);
        temp = head;
        int i = 0;
        while(temp!=null){
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}

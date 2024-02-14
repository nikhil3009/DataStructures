package LinkedLists;

public class FinfpairsDLL {
    public static Node<Integer> findTail(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }

    public static List<int[]> findPairs(Node<Integer> head, int k) {
        List<int[]> pairs = new ArrayList<>();
        Node<Integer> left = head;
        Node<Integer> right = findTail(head);

        while(left != null && right != null && left != right && left.prev != right) {
            int sum = left.data + right.data;
            if (sum == k) {
                pairs.add(new int[]{left.data, right.data});
                // Move pointers safely
                left = (left.next != null) ? left.next : left;
                right = (right.prev != null) ? right.prev : right;
            }
            else if (sum < k) {
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }
        return pairs;
    }
}

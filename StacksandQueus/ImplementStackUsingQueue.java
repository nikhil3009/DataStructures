package StacksandQueus;

public class ImplementStackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    public MyStack() {

        q1 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
        for(int i = 0;i<q1.size()-1;i++){
            q1.add(q1.remove());
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

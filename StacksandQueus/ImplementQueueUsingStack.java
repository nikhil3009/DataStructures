package StacksandQueus;

public class ImplementQueueUsingStack {
    class MyQueue {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> res = new Stack<>();

        public void push(int x) {
            input.push(x);

        }

        public int pop() {
            if(res.isEmpty()){
                while(input.isEmpty() == false){
                    res.push(input.peek());
                    input.pop();
                }
            }
            int x = res.peek();
            res.pop();
            return x;

        }

        public int peek() {
            if(res.isEmpty() == true){
                while(input.isEmpty() == false){
                    res.push(input.peek());
                    input.pop();
                }

            }
            return res.peek();

        }

        public boolean empty() {
            return (res.isEmpty() && input.isEmpty());

        }
    }
}

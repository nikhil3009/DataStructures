package Recursion;

public class ReverseStack {
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()){
            return;
        }
        int temp = s.pop();
        reverse(s);
        insert(s,temp);
        return;
    }
    static void insert(Stack<Integer> s, int temp){
        if(s.isEmpty()){
            s.push(temp);
        }
        else{
            int t = s.pop();
            insert(s,temp);
            s.push(t);
        }
        return;

    }
}

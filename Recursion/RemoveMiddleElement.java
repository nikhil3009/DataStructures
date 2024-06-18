package Recursion;

public class RemoveMiddleElement {
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        if(sizeOfStack == 0){
            return;
        }
        int mid = (sizeOfStack/2)+1;
        solve(s,mid);
        return;

    }
    public void solve(Stack<Integer>s, int mid){
        if(mid == 1){
            s.pop();
            return;
        }
        int temp = s.peek();
        s.pop();
        solve(s,mid-1);
        s.push(temp);
        return;
    }
}

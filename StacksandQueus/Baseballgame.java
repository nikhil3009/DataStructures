package StacksandQueus;

public class Baseballgame {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op : operations){
            if(op.equals("+") && st.size()>=2){
                int s1 = st.pop();
                int s2 = st.peek();
                int s3 = s1+s2;
                st.push(s1);
                st.push(s3);
            }
            else if(op.equals("D") && !st.isEmpty()){
                int s1 = st.peek();
                st.push(s1*2);
            }
            else if(op.equals("C") && !st.isEmpty()){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;

    }
}

package StacksandQueus;

public class Generateparenthesis {
    Stack<Character> st = new Stack<>();
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(0,0,n);
        return res;
    }
    public void generate(int open, int close, int n){
        if(open == close && close == n){
            Iterator i = st.iterator();
            String space = "";
            while(i.hasNext()){
                space = space+i.next();

            }
            res.add(space);
        }
        if(open < n){
            st.push('(');
            generate(open+1,close,n);
            st.pop();
        }
        if(close < open){
            st.push(')');
            generate(open,close+1,n);
            st.pop();
        }
    }
}

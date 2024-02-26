package StacksandQueus;

public class MinStack {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c=='[' || c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char ch = st.pop();
                    if(c == ')' &&  ch == '(' || c == '}' &&  ch == '{' || c == ']' &&  ch == '[' ) {
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();

    }
}

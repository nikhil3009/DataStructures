package Strings;

public class ReverseWordsinaString_151
{
    public String reverseWords(String s) {
        s = s.trim() + " ";
        String ans ="";
        Stack<String> st = new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                if (!str.isEmpty()) {
                    st.push(str);
                    str = "";
                }
            }
            else{
                str+=s.charAt(i);
            }
        }
        while(st.size()!=1){
            ans+=st.peek() + " ";
            st.pop();
        }
        ans+=st.peek();
        return ans;

    }
}

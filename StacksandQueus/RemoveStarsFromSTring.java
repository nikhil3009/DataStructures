package StacksandQueus;

public class RemoveStarsFromSTring {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char res : st){
            sb.append(res);
        }
        return sb.toString();

    }
}

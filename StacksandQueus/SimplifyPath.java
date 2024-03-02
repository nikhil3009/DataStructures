package StacksandQueus;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] dir = path.split("/");

        for(String i : dir){
            if(i.isEmpty() || i.equals(".")){
                continue;
            }
            if(i.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(i);
            }
        }
        return generateString(st);

    }
    public String generateString(Stack<String> st){
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.insert(0, "/" + st.pop());

        }
        if(res.length() == 0){
            res.append("/");
        }
        return res.toString();
    }

}

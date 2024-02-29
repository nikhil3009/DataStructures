package StacksandQueus;

public class AsteriodCOllision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int index= 0;
        while(index < asteroids.length){
            int a = asteroids[index];
            if(st.isEmpty()){
                st.push(a);
                index++;
            }
            else{
                if(st.peek() >0 && a<0){
                    if(Math.abs(st.peek()) > Math.abs(a)){
                        index++;
                    }
                    else if(Math.abs(st.peek()) < Math.abs(a)){
                        st.pop();
                    }
                    else{
                        st.pop();
                        index++;
                    }
                }
                else{
                    st.push(a);
                    index++;
                }
            }
        }
        int[] res = new int[st.size()];
        for(int i = res.length-1;i>=0;i--){
            res[i] = st.pop();
        }
        return res;

    }
}

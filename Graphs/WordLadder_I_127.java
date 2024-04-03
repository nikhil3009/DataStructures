package Graphs;

public class WordLadder_I_127 {
    class Pair{
        String first;
        int second;
        Pair(String first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> st = new HashSet<>();
        int len = wordList.size();
        for(int i = 0; i<len;i++){
            st.add(wordList.get(i));
        }
        st.remove(beginWord);

        while(!q.isEmpty()){
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();

            if(word.equals(endWord) == true){
                return steps;
            }
            for(int i = 0; i<word.length();i++){
                for(char j='a';j<='z';j++){
                    char replaceArray[] = word.toCharArray();
                    replaceArray[i] = j;
                    String replacedWord = new String(replaceArray);

                    if(st.contains(replacedWord) == true){
                        st.remove(replacedWord);
                        q.add(new Pair(replacedWord,steps+1));

                    }
                }
            }
        }
        return 0;
    }
}

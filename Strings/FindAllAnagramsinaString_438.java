package Strings;

public class FindAllAnagramsinaString_438 {
    public List<Integer> findAnagrams(String s, String p) {
        int pc[] = new int[26];
        int sc[] = new int[26];
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }

        for(int i=0;i<p.length();i++){
            pc[p.charAt(i)-'a']++;
            sc[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pc,sc)){
            ans.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            sc[s.charAt(i)-'a']++;
            sc[s.charAt(i-p.length()) -'a']--;

            if(Arrays.equals(pc,sc)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;

    }
}

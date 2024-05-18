class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        st = set()
        i =0
        res =0
        for j in range(len(s)):
            while s[j] in st:
                st.remove(s[i])
                i = i+1
            st.add(s[j])
            res = max(res,j-i+1)
        return res
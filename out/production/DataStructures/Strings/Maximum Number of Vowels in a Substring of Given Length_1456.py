class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        i =0
        cnt =0
        res =0

        vowel = {'a','e','i','o','u'}

        for j in range(len(s)):
            if s[j] in vowel:
                cnt +=1
            else:
                cnt +=0
            if j-i+1 > k:
                if s[i] in vowel:
                    cnt -= 1
                i +=1
            res = max(res,cnt)
        return res
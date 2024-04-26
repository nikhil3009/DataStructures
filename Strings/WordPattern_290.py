class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word = s.split(" ")
        if len(word) != len(pattern):
            return False
        c2W = {}
        w2C = {}

        for c,w in zip(pattern,word):
            if c in c2W and c2W[c] != w:
                return False
            if w in w2C and w2C[w] != c:
                return False
            c2W[c] = w
            w2C[w] = c
        return True
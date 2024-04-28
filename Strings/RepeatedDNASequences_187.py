class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        repeat,res = set(),set()

        for c in range(len(s)-9):
            cur = s[c:c+10]
            if cur in repeat:
                res.add(cur)
            repeat.add(cur)
        return list(res)

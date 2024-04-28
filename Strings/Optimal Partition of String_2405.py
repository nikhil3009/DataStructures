class Solution:
    def partitionString(self, s: str) -> int:
        res=1
        check = set()

        for c in s:
            if c in check:
                res +=1
                check = set()
            check.add(c)
        return res

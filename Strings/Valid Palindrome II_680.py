class Solution:
    def validPalindrome(self, s: str) -> bool:
        l =0
        r =len(s) -1
        while l<r:
            if s[l] == s[r]:
                l +=1
                r -=1
            else:
                return self.validate(s,l+1,r) or self.validate(s,l,r-1)
        return True

    def validate(self,s,l,r):
        while l<r:
            if s[l] == s[r]:
                l +=1
                r -=1
            else:
                return False
        return True
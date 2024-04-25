class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        ctext = Counter(text)
        balloon = Counter("balloon")

        res = len(text)
        for c in balloon:
            res = min(res,ctext[c] // balloon[c])
        return res
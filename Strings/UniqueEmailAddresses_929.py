class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        unique: set[str] = set()
        for e in emails:
            name,domain = e.split("@")
            name = name.split("+")[0]
            name = name.replace(".","")
            email = name+"@"+domain
            unique.add(email)
        return len(unique)

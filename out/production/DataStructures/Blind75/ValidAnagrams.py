def isAnagram(self, s: str, t: str) -> bool:
    dict1 = {}
    dict2 = {}
    for i in s:
        if i not in dict1:
            dict1[i] = 1
        else:
            dict1[i] += 1
    for j in t:
        if j not in dict2:
            dict2[j] = 1
        else:
            dict2[j] +=1
    return dict1 == dict2
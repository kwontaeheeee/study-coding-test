from collections import Counter

def solution(s):
    count = Counter(s)
    result = ''.join(sorted([char for char, cnt in count.items() if cnt == 1]))
    return result

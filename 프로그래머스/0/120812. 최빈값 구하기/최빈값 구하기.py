from collections import Counter

def solution(array):
 
    count = Counter(array)

    max_count = max(count.values())
    
 
    most_common = [key for key, value in count.items() if value == max_count]
    

    if len(most_common) > 1:
        return -1
 
    else:
        return most_common[0]

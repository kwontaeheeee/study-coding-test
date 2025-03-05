def solution(age):
  
    return ''.join(chr(ord('a') + int(digit)) for digit in str(age))
print(solution(35))

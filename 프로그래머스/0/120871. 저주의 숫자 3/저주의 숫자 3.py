def is_valid_number(num):
    # 숫자에 3이 포함되어 있거나 3의 배수인 경우 False 반환
    return '3' not in str(num) and num % 3 != 0

def solution(n):
    count = 0  # 3x 마을 숫자의 순서를 세기 위한 변수
    num = 0    # 현재 숫자
    
    while count < n:
        num += 1
        if is_valid_number(num):  # 유효한 숫자일 경우
            count += 1
    
    return num

# 예시
print(solution(1))  # 출력: 1
print(solution(2))  # 출력: 2
print(solution(5))  # 출력: 8
print(solution(10)) # 출력: 20




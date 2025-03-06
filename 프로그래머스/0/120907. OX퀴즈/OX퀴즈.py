def solution(quiz):
    result = []
    
    for q in quiz:
        # 수식에서 연산자를 기준으로 split
        left, operation, right, equals, expected = q.split()
        
        # 왼쪽과 오른쪽 숫자, 결과를 정수로 변환
        left = int(left)
        right = int(right)
        expected = int(expected)
        
        # 연산 수행
        if operation == '+':
            calc_result = left + right
        elif operation == '-':
            calc_result = left - right
        
        # 결과가 맞으면 "O", 틀리면 "X"
        if calc_result == expected:
            result.append("O")
        else:
            result.append("X")
    
    return result

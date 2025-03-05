def solution(dots):
    
    x_coords = [dot[0] for dot in dots]
    y_coords = [dot[1] for dot in dots]
    

    width = max(x_coords) - min(x_coords)
    height = max(y_coords) - min(y_coords)
    

    return width * height

print(solution([[1, 1], [3, 1], [3, 3], [1, 3]])) 
print(solution([[0, 0], [0, 2], [2, 0], [2, 2]]))  

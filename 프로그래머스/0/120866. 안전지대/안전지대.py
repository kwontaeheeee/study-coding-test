def solution(board):
    dxlist = [-1, 0, 1, 1, 1, 0, -1, -1]
    dylist = [1, 1, 1, 0, -1, -1, -1, 0]
    for x in range(len(board)) :
        for y in range(len(board[0])) :
            if board[x][y] == 1 :
                for dx, dy in zip(dxlist, dylist) :
                    if x+dx < 0 or y+dy < 0 or x+dx >= len(board) or y+dy >= len(board[0]) :
                        pass
                    elif board[x+dx][y+dy] == 0 :
                        board[x+dx][y+dy] = 2
    return sum([1 for b in board for i in b if i == 0])
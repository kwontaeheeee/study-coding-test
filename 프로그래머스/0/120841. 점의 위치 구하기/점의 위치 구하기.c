#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// dot_len은 배열 dot의 길이입니다.
int solution(int dot[], size_t dot_len) 
{
    int ans[2][2] = {{3,2}, {4,1}};
    return ans[dot[0] > 0][dot[1] > 0];
}
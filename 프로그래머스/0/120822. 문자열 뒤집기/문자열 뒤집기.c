#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(const char* my_string) {
    char* answer = (char*)malloc(sizeof(char)* strlen(my_string));
    memset(answer,0,sizeof(char)*strlen(my_string));
    for(int i=0;i<=strlen(my_string);i++)
    {
        answer[i] = my_string[strlen(my_string) - i - 1];
        printf("%c %c \n",answer[i],my_string[strlen(my_string) - i]);
    }

    return answer;
}
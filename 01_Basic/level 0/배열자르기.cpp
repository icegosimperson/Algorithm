#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int numbers[], size_t numbers_len, int num1, int num2) {
    int* answer = (int*)malloc(10000);
    for (int i=0; i<numbers_len; i++)
    {        
        answer[i] = numbers[num1];
        num1++;
    }
    return answer;
}

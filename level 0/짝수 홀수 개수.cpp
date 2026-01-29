#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int num_list[], size_t num_list_len) {

    int* answer = (int*)malloc(1000);
    int Even = 0; //짝수 
    int Odd = 0; //홀수
    
    for (int i=0; i<num_list_len; i++)
    {
        if (num_list[i] % 2 ==0)
            Even += 1;
        else 
            Odd += 1;
    }
    
    answer[0] = Even;
    answer[1] = Odd;
    
    return answer;
}

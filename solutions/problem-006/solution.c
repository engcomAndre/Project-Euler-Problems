/*
 * Solution of problem 6 of ProjectEuler
 * https://projecteuler.net/problem=6
*/

#include <stdio.h>

int sum_of_squares(int n) {
    return ((n * (n+1) * (2*n +1))/6);
}

int sum_square(int n) {
    return ((n * n * (n+1) * (n+1))/4);
}

int main() {

    int answer = ( sum_square(100) - sum_of_squares(100) );
    printf("%i\n", answer);

    return 0;
}

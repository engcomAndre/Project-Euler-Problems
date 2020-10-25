/*
 * Solution of problem 12 of ProjectEuler
 * https://projecteuler.net/problem=12
*/

#include <stdio.h>

int number_of_dividers(int n) {
    int i,ans,cnt;
    ans = 1;
    i = 2;

    while (i*i <= n) {
        cnt = 0;

        while (n%i == 0) {
            n /= i;
            cnt++;
        }
        
        if (cnt) ans *= (cnt +1);
        
        i++;
    }
    
    if (n > 1) ans *= 2;
    
    return ans;
}

int main() {

    int current_term = 1;
    int index = 2;

    while (number_of_dividers(current_term) < 500) {
        current_term += index;
        index++;
    }
    
    printf("%i\n", current_term);

    return 0;
}

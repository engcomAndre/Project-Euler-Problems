
#include <stdio.h>

typedef long long _i64;

_i64 largest_prime_factor(_i64 n) {
    _i64 i = 2LL;

    // After this process, the variable n will be storing the largest prime factor
    while (i*i <= n) {
        while (n%i == 0)
            n /= i;
        
        i++;
    }
    
    return n;
}

int main() {

    _i64 n = 600851475143;
    printf("answer: %lli\n", largest_prime_factor(n));

    return 0;
}

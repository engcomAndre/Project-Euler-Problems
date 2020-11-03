#include <stdio.h>

int gcd(int a, int b) {
    int r = (a%b);

    return (r ? gcd(b, r) : b);
}

/* 
    The lcm function recursively calculates the smallest
    common multiple of numbers from 1 to n
    
    OBS.: if n > 22, you will need integers greater than 32 bits
*/
int lcm(int n) {
    if (n < 2)
        return 1;
    
    int aux = lcm(n-1);

    return (n * (aux/gcd(aux, n)) );
}

int main() {

    printf("%i\n", lcm(20));

    return 0;
}

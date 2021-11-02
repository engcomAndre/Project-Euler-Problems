#include <stdio.h>
#include <string.h>

#define ISBITSET(x, i) (( x[i>>3] & (1<<(i&7)) ) != 0)
#define SETBIT(x, i) x[i>>3] |= (1<<(i&7));
#define CLEARBIT(x, i) x[i>>3] &= (1<<(i&7)) ^ 0xFF;

long long sumPrimes(int n)
{
    char b[n/8+1];
    long long i, p;
    long long s = 0;

    memset(b, 255, sizeof(b));
    for (p=2; p<n; p++) 
    {
        if (ISBITSET(b,p)) 
        {
            s += p;
            for (i=p*p; i<n; i+=p) 
            {
                CLEARBIT(b, i);
            }
        }
    }
    return s; 
}

int main() 
{
    printf("%lld\n", sumPrimes(2000000));
    return 0; 
}

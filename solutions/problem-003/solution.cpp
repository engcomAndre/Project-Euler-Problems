#include <bits/stdc++.h>
using namespace std;

long long largest_prime_factor(long long n)
{
    long long i = 2LL;

    while (i * i <= n)
    {
        while (n % i == 0)
            n /= i;

        i++;
    }

    return n;
}

int main()
{

    long long n = 600851475143;
    cout << "Largest Prime Factor is : " << largest_prime_factor(n);

    return 0;
}

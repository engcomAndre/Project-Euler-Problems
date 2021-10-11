#include <bits/stdc++.h>
using namespace std;

int gcd(int a, int b)
{
    int r = (a % b);

    return (r ? gcd(b, r) : b);
}

int lcm(int n)
{
    if (n < 2)
        return 1;

    int aux = lcm(n - 1);

    return (n * (aux / gcd(aux, n)));
}

int main()
{
    cout << lcm(20);

    return 0;
}

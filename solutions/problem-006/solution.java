#include <bits/stdc++.h>
using namespace std;

int sumSquares(int n)
{
    return ((n * (n + 1) * (2 * n + 1)) / 6);
}

int square(int n)
{
    return ((n * n * (n + 1) * (n + 1)) / 4);
}

int main()
{

    int answer = (square(100) - sumSquares(100));
    cout << answer;

    return 0;
}

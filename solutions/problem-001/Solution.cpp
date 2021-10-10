#include <bits/stdc++.h>
using namespace std;

int main()
{
    int N = 0, answer = 0;

    while (N < 1000)
    {
        if (N % 3 == 0 || N % 5 == 0)
        {
            answer += N;
        }
        N++;
    }
    cout << answer;
    return 0;
}

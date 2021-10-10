#include <stdio.h>

static int isPalin(int num)
{
    int test = num, rev = 0;
    while (test > 0)
    {
        rev = rev * 10 + (test % 10);
        test /= 10;
    }
    return rev == num;
}

int main()
{
    int bigPalin = -1, big1 = 0, big2 = 0;

    for (int n1 = 100; n1 < 1000; ++n1)
    {
        int prod = 99 * n1;
        for (int n2 = 100; n2 < 1000; ++n2)
        {
            prod += n1;

            if (prod > bigPalin && isPalin(prod))
            {
                big1 = n1;
                big2 = n2;
                bigPalin = prod;
            }
        }
    }

    printf("%d x %d = %d\n", big1, big2, bigPalin);
    return 0;
}

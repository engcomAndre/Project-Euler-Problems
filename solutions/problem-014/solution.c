#include <stdio.h>
#define TAM 1000001

typedef unsigned int uint;

uint lens[TAM];

uint f(uint x)
{
  return x % 2 ? (3 * x + 1) : (x / 2);
}

uint length(uint x)
{
  if (x <= 1)
    return 1;

  uint y = f(x);

  if (x < TAM)
  {
    if (lens[x] != 0)
      return lens[x];

    return lens[x] = 1 + length(y);
  }

  return 1 + length(y);
}

int main()
{
  uint ans, max_len = 0;

  for (uint i = 1; i < TAM; i++)
  {
    uint len_i = length(i);

    if (len_i > max_len)
    {
      max_len = len_i;
      ans = i;
    }
  }

  printf("%i\n", ans);

  return 0;
}

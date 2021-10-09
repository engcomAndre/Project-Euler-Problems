#include <stdio.h>
#define TAM 21

typedef long long int ll_int;

ll_int grid[TAM][TAM];

void compute_grid()
{
  grid[0][0] = 0;

  for (int i = 1; i < TAM; i++)
    grid[0][i] = grid[i][0] = 1;

  for (int i = 1; i < TAM; i++)
    for (int j = 1; j < TAM; j++)
      grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
}

ll_int paths(int l)
{
  return grid[l][l];
}

int main()
{
  compute_grid();
  printf("%lli\n", paths(20));

  return 0;
}

# uma solucao 'ingenua' que no pior caso faria 1000xnum_total_de_palindromes operacoes

# testa se existem m e n, com 99 < m,n < 1000 e mn = num
def is_solution(num):
    for n in range(999, 99, -1):
        m = int(num/n)
        if num%n == 0 and m < 1000:
            print(f'{num} = {n} x {m}')
            return True

    return False

# passa por todas as palindromes de 6 digitos
def all_palindromes():
    for i in range(9, 0, -1):
        for j in range(9, -1, -1):
            for k in range(9, -1, -1):
                num = i*100001 + j*10010 + k*1100
                if (is_solution(num)):
                    return

all_palindromes()


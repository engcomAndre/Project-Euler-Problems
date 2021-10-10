def calc_carry(n):
    return ((n - (n % 10))//10, n % 10)


def times_2(n):
    soma = ''
    carry = 0

    for c in n[::-1]:
        carry, f = calc_carry(2*int(c) + carry)
        soma += str(f)

    if carry != 0:
        soma += str(carry)

    return soma[::-1]


def power_digit_sum(e):
    p = '1'
    ans = 0

    while e > 0:
        p = times_2(p)
        e -= 1

    for c in p:
        ans += int(c)

    return ans


print(power_digit_sum(1000))

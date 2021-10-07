result = 0
for a in range(1, 1000):
    for b in [3, 5]:
        if a % b == 0:
            result += a
            break

print(result)

def eratosthenes2(n):
    multiples = set()

    #Iterate through [2,2000000]
    for i in range(2, n+1):
        if i not in multiples:
            yield i
            
            multiples.update(range(i*i, n+1, i))

iter = 0
ml = list(eratosthenes2(2000000))
for x in ml:
    iter = int(x) + iter

print(iter)

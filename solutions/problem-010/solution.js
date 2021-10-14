var sieve = [], primes = [], sum = 0, max = 5;

for (var i = 2; i <= max; ++i) {
    if (!sieve[i]) {
        // i has not been marked -- it is prime
        sum += i;
        for (var j = i << 1; j <= max; j += i) {
            sieve[j] = true;
        }
    }
}
console.log(sum);

#include <iostream>
using namespace std;

int primes[10000] = {0}; // initialize array of primes

bool isPrime(int n);

int main() {

  int num = 1; // prime counter, number 2 already considered as prime
	int i = 3; // then this counter starts with 3

	while (num <= 10001) {

		if (isPrime(i)) {

			num++;

			if (num==10001) {

				cout << i;

				return 0;
			}

		}

		i += 2; // and just checks odd numbers
	}

	return 0;

}

 bool isPrime(int n) {

	 int j = 0;

	 primes[0] = 2; // first prime

	 while (n > primes[j] and n % primes[j] != 0) {

		 j++;

		 if (primes[j]==0) { // we go across the array of primes and we find a 0, it means number n is prime

			 primes[j] = n; // instead of leaving in a 0, save last prime found in that position

			 return true; // if n is prime
		 }

	 }

	 return false; // if n is not prime
}

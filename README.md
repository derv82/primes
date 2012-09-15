primes
======

Calculate and efficiently store prime numbers

Created to assist in [Project Euler](http://projecteuler.net).

calculations
============

Calculating the next prime in sequence: O(N)

Calculating a prime out of sequence: O(N^N)
* This is because all primes before N are calculated and stored

lookup
======

Check if a pre-calculated number N is a prime: O(1)

Check if non-pre-calculated number N is prime: O(N^N)

memory usage
============

Space to store all primes up to N: O(N)

The class uses 1/2 bit for each number stored because it ignores even integers.


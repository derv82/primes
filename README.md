primes
======

Efficiently stores prime numbers for fast lookup

Pros:
* Decreased space usage - 1/2 bit per number.
* Fast O(1) lookup for pre-calculated integers

Cons:
* Naive (slow) algorithm for calculating primes

Created to assist in [Project Euler](http://projecteuler.net) problems.

memory usage
============

Space required to store all primes up to N: O(N)

The program uses 1/2 bit for each number stored because we can ignore even integers.

This means that storing the first 1,000,000 primes will use approximately 65kb of memory.

running times
=============

Check if a pre-calculated number N is a prime: O(1)
* Simply looks up int in array then ANDs with a bitmask.

Check if non-pre-calculated number N is prime: O(N^M)
* Where N is the number to look up and M is the distance from the last calculated prime to N
* This cost is because all odd numbers before N must be calculated and stored

Calculating the next prime in sequence: O(N)
* Prime check will attempt to find any relevant odd factors of N.

Calculating a prime out of sequence: O(N^M)
* Where N is the number to check and M is the distance from the last calculated prime to N
* This cost is because all odd numbers before N must be calculated and stored

sample
======

    Primes p = new Primes(64); // Calculates all primes between 3 and 64 (inclusive)
    p.printBitmap();
    // Output is below
    Bitmap of odd primes (from 3 to 64):
        11101101101001100101101001001100

This tells us which odd numbers are prime, starting at 3. From this, we know the following numbers are prime:

	3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61

To check if a pre-caclulated number in sequence is prime:

    if (p.isPrime(31))
        System.out.println("31 is prime.");

To check if a number that has not been calculated yet is prime:

    if (p.isPrime(1023))
        System.out.println("1023 is prime.");
    // Note that the system will check all odd integers between 64 and 1023
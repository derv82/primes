/** For testing Primes class. */
public class Main {
	
	/** Main for testing Primes class. */
	public static void main(String[] args) {
		showInitPrimes();
		showNextPrime();
	}

	/** Show how to initialize Primes class. */
	public static void showInitPrimes() {
		// Initialize to contain all primes up to 128
		Primes primes = new Primes(128);
		primes.printBitmap();
	}

	/** Shows how to grab next primes in sequence. */
	public static void showNextPrime() {
		Primes primes = new Primes(); // Initialize empty primes.
		
		primes.printBitmap(); // Display empty bitmap
		
		// Print the first 64 primes
		System.out.println("The first 64 primes:");
		for (int i = 0; i < 64; i++) {
			System.out.println("\tPrime #" + (i + 1) + ": " + primes.nextPrime());
		}
		
		primes.printBitmap(); // Bitmap of first 24 primes
	}
}

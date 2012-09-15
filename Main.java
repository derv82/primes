/** For testing Primes class. */
public class Main {
	
	/** Main for testing Primes class. */
	public static void main(String[] args) {
		showInitPrimes();
		showNextPrime();
	}

	/** Show how to initialize Primes class. */
	public static void showInitPrimes() {
		// Initialize to contain all primes up to 64
		Primes primes = new Primes(64);
		primes.printBitmap();
	}

	/** Shows how to grab next primes in sequence. */
	public static void showNextPrime() {
		Primes primes = new Primes(); // Initialize class.
		
		primes.printBitmap(); // Empty bitmap
		
		// Print the first 24 primes
		for (int i = 0; i < 24; i++) {
			System.out.println(primes.nextPrime());
		}
		
		primes.printBitmap(); // Bitmap of first 24 primes
	}
}

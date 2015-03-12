package ua.nure.yakovenko.Task1;

/**
 * Represents the solution to Task 7.
 * @author Yakovenko Denis
 *
 */
public class Task7 {

	/**
	 * Explanation of the usage of the solution method.
	 */
	private static void usage() {
		System.out.println("Usage: java "
				+ "ua.kharkov.knure.yakovenko.Task1.Task7 X");
	}
	
    // Task 1.7
	/**
	 * The method that solves the 7th task.
	 * @param n the required length of returning array.
	 * @return the array of prime numbers of the required length.
	 */
    public static int[] arrayOfPrimes(int n) {
        int[] primes = new int[n];
        int k = 0;
        for(int i = 2; ; ++i) {
            boolean isPrime = true;
            if(i%2 == 0) {
            	isPrime = false;
            }
            if(i == 2) {
            	isPrime = true;
            }
            for(int j = 3; i >= j*j; j+=2) {
                if(i%j == 0){
                    isPrime = false;
                }
            }
            if(isPrime) {
                primes[k++] = i;
            }
            if(k == n){
                break;
            }
        }
        return primes;
    }

    /**
     * Invokes the solution method.
     * @param args must contain one argument to pass to the 
     * solution method.
     */
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		int res[] = arrayOfPrimes(x);
		System.out.println("===START Task 7===\n");
		System.out.println("The array of prime numbers with the length of " + x + ": ");
		for(int i = 0; i < res.length; ++i){
			System.out.print(res[i] + " ");
		}
		System.out.println("\n===END Task 7===\n");
	}
}
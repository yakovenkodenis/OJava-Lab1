package ua.nure.yakovenko.Task1;

/**
 * Represents the solution to Task 3.
 * @author Yakovenko Denis
 *
 */
public class Task3 {

	/**
	 * Explanation of the usage of the solution method.
	 */
	private static void usage() {
		System.out.println("Usage: java "
				+ "ua.kharkov.knure.yakovenko.Task1.Task3 X");
	}
	
    // Task 1.3 Check if the number is prime
	/**
	 * Solves task 3.
	 * @param a A number to pass.
	 * @return the boolean value representing if
	 * the passed argument is prime number or not.
	 */
    public static boolean isPrime(int a) {
        if(a%2 == 0) {
        	return false;
        }
        for(int i = 3; a >= i*i; i+=2) {
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * Invokes the solution method.
     * @param args must contain one argument to pass in.
     */
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		boolean prime = isPrime(x);
		System.out.println("===START Task 3===\n");
		System.out.println("The number x = " + x + " is " + (prime ? "PRIME" : "NOT PRIME"));
		System.out.println("\n===END Task 3===\n");
	}
}
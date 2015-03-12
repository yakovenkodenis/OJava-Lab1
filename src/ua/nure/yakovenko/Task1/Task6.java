package ua.nure.yakovenko.Task1;

/**
 * Represents the solution to Task 6.
 * @author Yakovenko Denis
 *
 */
public class Task6 {
	
	/**
	 * Explains the usage of the solution method.
	 */
	private static void usage() {
		System.out.println("Usage: java "
				+ "ua.kharkov.knure.yakovenko.Task1.Task6 X");
	}
	
    // Task 1.6
	/**
	 * Method provides the solution to task 6.
	 * @param n the length of the array of fibonacci numbers required
	 * @return the array of fibonacci numbers of the required length
	 */
    public static int[] arrayOfFibs(int n) {
        if(n == 1) {
            return new int[]{1};
        }
        else if(n == 2) {
            return new int[]{1, 1};
        }
        else {
            int[] fibs = new int[n];
            fibs[0] = 1;
            fibs[1] = 1;

            for (int i = 2; i < n; ++i) {
                fibs[i] = fibs[i-1] + fibs[i-2];
            }
            return fibs;
        }
    }
	
    /**
     * Invokes the solution method
     * @param args must contain one argument to pass
     * to the solution method.
     */
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		int res[] = arrayOfFibs(x);
		System.out.println("===START Task 6===\n");
		System.out.println("The array of Fibonacci numbers with the length of " + x + ": ");
		for(int i = 0; i < res.length; ++i){
			System.out.print(res[i] + " ");
		}
		System.out.println("\n===END Task 6===\n");
	}
}
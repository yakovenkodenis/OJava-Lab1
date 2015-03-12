package ua.nure.yakovenko.Task1;

/**
 * Represents the solution to Task 2.
 * @author Yakovenko Denis
 *
 */
public class Task2 {

	/**
	 * The explanation of the usage of the class.
	 */
	private static void usage() {
		System.out.println("Usage: java "
				+ "ua.kharkov.knure.yakovenko.Task1.Task2 X");
	}
	
    // Task 1.2 Find the sum of numbers in random integer
	/**
	 * Solves task 2.
	 * @param n the integer number to pass
	 * @return the required sum.
	 */
    public static int numSum(int n) {
        int res = 0;
        int a = n;
        a = a < 0 ? -a : a;
        while(a > 0) {
            res += a % 10;
            a /= 10;
        }
        return res;
    }

    /**
     * Invokes the solution method.
     * @param args must contain one argument to pass into.
     */
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		int sum = numSum(x);
		System.out.println("===START Task 2===\n");
		System.out.println("Number x = " + x + ", sum of digits --> " + sum);
		System.out.println("\n===END Task 2===\n");
	}
}
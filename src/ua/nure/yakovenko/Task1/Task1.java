package ua.nure.yakovenko.Task1;

/**
 * Represents the solution to Task 1.
 * @author Yakovenko Denis
 *
 */
public class Task1 {

	/**
	 * The explanation of the usage of the class.
	 */
	private static void usage() {
		System.out.println("Usage: java "
				+ "ua.kharkov.knure.yakovenko.Task1.Task1 X Y");
	}
	
    // Task 1.1 Find the Greatest Common Divisor
	/**
	 * Solves the 1st task.
	 * @param a the first parameter
	 * @param b the second parameter
	 * @return the greatest common divisor of the two numbers
	 */
    public static int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        else if(a == 0){
            return b;
        }
        else {
        	return gcd(b, a%b);
        }
    }

    /**
     * Invokes the solution method.
     * @param args must contain 2 numbers as the arguments.
     */
	public static void main(String[] args) {
		if (args.length != 2) {
			usage();
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int nod = gcd(x, y);
		System.out.println("===START Task 1===\n");
		System.out.println("NOD x = " + x + ", y = " + y + " --> " + nod);
		System.out.println("\n===END Task 1===\n");
	}
}
package ua.nure.yakovenko.Task1;

import java.math.BigInteger;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.valueOf;

/**
 * Represents the solution to Task 4.
 * @author Yakovenko Denis
 *
 */
public class Task4 {

	/**
	 * The explanation of the usage of the class.
	 */
	private static void usage() {
		System.out.println("Usage: java "
				+ "ua.kharkov.knure.yakovenko.Task1.Task4 X");
	}
	
    // Task 1.4 Count 1! - 2! + 3! - 4! + 5! - ...
	/**
	 * The main solution method that solves task 4.
	 * @param n the length of the sum.
	 * @return the required sum.
	 */
    public static String countFactorials(int n) {
        BigInteger res = ONE;
        for(int i = 1, j = 1; i <= n; ++i, j*=-1) {
            res = res.add(factorial(i).multiply(valueOf(j)));
        }
        return res.toString();
    }


    // Twice less of multiplications
    /** 8! = 8*(8+6=14)*(14+4=18)*(18+2);
    * 9! = 9*(9+7=16)*(16+5=21)*(21+3=24)*(Math.ceil(9/2)=5);
    */
    private static BigInteger factorial(int n) {
        BigInteger res = ONE;
        if(n <= 0) {
        	return res;
        }
        res = valueOf(n);
        if(n%2 != 0) {
            res = res.multiply(valueOf((int)Math.ceil(n/2.0)));
        }
        for (int count = 0, subtrahend = n - 2, multiplier = n + subtrahend;
             count < n / 2 - 1;
             count++, subtrahend -= 2, multiplier+=subtrahend) {
            res = res.multiply(BigInteger.valueOf(multiplier));
        }
        return res;
    }

    /**
     * Invokes the solution method.
     * @param args must contain only 1 argument.
     */
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		String res = countFactorials(x);
		System.out.println("===START Task 4===\n");
		System.out.println("Sum of the row for the N = " + x + " --> " + res);
		System.out.println("\n===END Task 4===\n");
	}
}
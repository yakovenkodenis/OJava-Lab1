package ua.nure.yakovenko.Task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the solution to Task 5.
 * @author Yakovenko Denis
 *
 */
public class Task5 {
	
	/**
	 * The explanation of the usage of the class.
	 */
	private static void usage() {
		System.out.println("Usage: java "
				+ "ua.kharkov.knure.yakovenko.Task1.Task5 X");
	}
	
    // Task 1.5
	/**
	 * Solves task 5.
	 * @param n the top integer number
	 * @return the number of possible answers to 
	 * the task 5.
	 */
    public static int countHalvesInDigits(int n) {
        int count = 0;
        List<Integer> digits = getNumbersInDiapason(n);
        for (Integer digit : digits) {
            if (checkSum(digit, n, true) == checkSum(digit, n, false)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks half sums of the number 
     * @param num the number
     * @param capacity the length of the number
     * @param firstPart says if we should count the first or
     * the second part of the number.
     * @return
     */
    private static int checkSum(int num, int capacity, boolean firstPart) {
        int res = 0;
        if(firstPart) {
            for (int i = capacity / 2 + 1; i <= capacity; ++i) {
                res += getNum(num, i);
            }
        } else {
            for(int i = 1; i <= capacity / 2; ++i) {
                res += getNum(num, i);
            }
        }
        return res;
    }

    // [10**(N-1) + 1]...[10**N - 1]
    /**
     * Gets the diapason of numbers
     * @param num the top number
     * @return the list of numbers up to num.
     */
    private static List<Integer> getNumbersInDiapason(int num) {
        List<Integer> list = new ArrayList<Integer>();
        int from = (int)Math.pow(10, num - 1) + 1;
        int to = (int)Math.pow(10, num) - 1;
        for(int i = from; i <= to; ++i) {
            list.add(i);
        }
        return list;
    }

    // number in the digit = num/10**(capacity-1)%10
    private static int getNum(int num, int place) {
        return num / (int)Math.pow(10, place - 1) % 10;
    }

    /**
     * Invokes the solution method.
     * @param args must contain 1 argument.
     */
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		int res = countHalvesInDigits(x);
		System.out.println("===START Task 5===\n");
		System.out.println("The number of the " + x + "-digit numbers --> " + res);
		System.out.println("\n===END Task 5===\n");
	}
}

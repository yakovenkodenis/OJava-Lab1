package ua.nure.yakovenko.Task1;

/**
 * Represents the solution to Task 8.
 * @author Yakovenko Denis
 *
 */
public class Task8 {

	/**
	 * The usage of the solution method.
	 */
	private static void usage() {
		System.out.println("Usage: java "
				+ "ua.kharkov.knure.yakovenko.Task1.Task8 X Y");
	}
	
    // Task 1.8
	/**
	 * Method that solves task 8.
	 * @param n first dimension
	 * @param m second dimension
	 * @return the matrix of two letters in chess order.
	 */
    public static char[][] getStaggeredArray(int n, int m) {
        char[][] arr = new char[n][m];
        boolean cha = true;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                arr[i][j] = cha ? '×' : 'Á';
                cha = !cha;
                if(m%2 == 0 && j == m - 1){
                    cha = !cha;
                }
            }
        }
        return arr;
    }

    /**
     * Invokes the solution method.
     * @param args must contain the 2 arguments for
     * the solution method.
     */
	public static void main(String[] args) {
		if (args.length != 2) {
			usage();
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		System.out.println("===START Task 8===\n");
		System.out.println("The matrix " + x + " of " + y + " with letters × and Á in the chess order: ");
	      char[][] arr = getStaggeredArray(x, y);
	      for(int i = 0; i < x; ++i){
	          for(int j = 0; j < y; ++j){
	              System.out.print(arr[i][j] + " ");
	          }
	          System.out.println();
	      }
	      System.out.println("\n===END Task 8===\n");
	}
}
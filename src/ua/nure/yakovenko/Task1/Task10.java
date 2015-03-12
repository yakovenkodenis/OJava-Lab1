package ua.nure.yakovenko.Task1;

/**
 * Represents the solution to Task 10.
 * @author Yakovenko Denis
 *
 */
public class Task10 {

	/** 
	 * The explanation of usage of the class.
	*/
	private static void usage() {
		System.out.println("Usage: java "
				+ "ua.kharkov.knure.yakovenko.Task1.Task10 X");
	}
	
    // Task 1.10
	/**
	 * The main method that solves the task.
	 * @param n the number of rows in the returning array.
	 * @return two-dimension array representing the Pascal Triangle of n rows.
	 */
    public static int[][] getPascalTriangle(int n) {
        int[][] arr = new int[n][];
        for(int j = 0; j < n; ++j) {
            int[] tmp = new int[j+1];
            for(int k = 0; k < j + 1; ++k){
                if(k == 0 || k == j) {
                    tmp[k] = 1;
                    continue;
                }
                tmp[k] = arr[j-1][k]+arr[j-1][k-1];
            }
            arr[j]  = tmp;
        }
        return arr;
    }

    /**
     * Main method where the getPascal Triangle() is called.
     * @param args the string array that receives the method 
     * and passes its values to the solution method.
     */
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		System.out.println("===START Task 10===\n");
		
		System.out.println("The Pascal Triangle of " + x + " rows has been printed: ");
	      int[][] arr = getPascalTriangle(7);
	      for (int[] anArr : arr) {
	          for (int anAnArr : anArr){
	              System.out.print(anAnArr + " ");
	          }
	          System.out.println();
	      }
	      System.out.println("\n===END Task 10===\n");
	}
}
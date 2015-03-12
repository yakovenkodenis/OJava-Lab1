package ua.nure.yakovenko.Task1;


/**
 * Represents the solution to Task 9.
 * @author Yakovenko Denis
 *
 */
public class Task9 {

	
	/**
	 * Method explains the usage of the solution method.
	 */
	private static void usage() {
		System.out.println("Usage: java "
				+ "ua.kharkov.knure.yakovenko.Task1.Task9");
	}
	
    // Task 1.9
    /** monster.count() = 2**5 = 32;
    * index = number / size**(dimension - 1) % size;
    */
    public static int[][][][][][] monsterNaturalArray(){
        int[][][][][][] monster = new int[2][2][2][2][2][2];
        int one, two, three, four, five, six;
        for(int i = 1; i <= 32; ++i) {
            one = i % 2;
            two = i / 2 % 2;
            three = i / (2 * 2) % 2;
            four = i / (2 * 2 * 2) % 2;
            five = i / (2 * 2 * 2 * 2) % 2;
            six = i / (2 * 2 * 2 * 2 * 2) % 2;
            monster[six][five][four][three][two][one] = i;
        }
        return monster;
    }

    /**
     * The main method that invokes the solution method.
     * @param args must be empty.
     */
	public static void main(String[] args) {
		if (args.length != 0) {
			usage();
			return;
		}

		System.out.println("===START Task 9===\n");
		System.out.println("Six-dimensional array of natural numbers has been printed: ");
	      int[][][][][][] monster = monsterNaturalArray();
	      int one, two, three, four, five, six;
	      for(int i = 1; i <= 32; ++i) {
	          one = i % 2;
	          two = i / 2 % 2;
	          three = i / (2 * 2) % 2;
	          four = i / (2 * 2 * 2) % 2;
	          five = i / (2 * 2 * 2 * 2) % 2;
	          six = i / (2 * 2 * 2 * 2 * 2) % 2;
	          System.out.print(monster[six][five][four][three][two][one] + " ");
	      }
	      System.out.println("\n\n===END Task 9===\n");
	}
}
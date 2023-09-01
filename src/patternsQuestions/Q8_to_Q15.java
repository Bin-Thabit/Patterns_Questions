package patternsQuestions;

public class Q8_to_Q15 {

	public static void main(String[] args) {
		/*
		pattern8(5);
		pattern9(5);
		pattern10(5);
		pattern11(5);
		*/
		pattern12(5);
	}
	// Pattern 8
	
				/*
						     *
						    ***
						   *****
						  *******
						 *********
			    */
	static void pattern8(int n) {
		for (int row = 1; row <= n; row++) {
			for(int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			int correctColsInRow = row == 1 ? 1 : 2 * row - 1;
			for (int col = 1; col <= correctColsInRow; col++) {
				System.out.print("*");
			}
			// When row is printed, we need a new line
			System.out.println();
		}
	}
	// Pattern 9
	
	/*
			   *********
			    *******
			     *****
			      ***
			       *
    */
	
	static void pattern9(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= row - 1; space++) {
				System.out.print(" ");
			}
				for (int col = row; col <= (2 * n) - row; col++) {
					System.out.print("*");
				}
			System.out.println();
		}
	}
	
	// Pattern 10
	
		/*
				    *
			       * *
			      * * *
			     * * * *
			    * * * * *
	    */
	static void pattern10(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
				for (int col = 1; col <= row; col++) {
					System.out.print("* ");
				}
			System.out.println();
		}
	}
	
	// Pattern 11
	
			/*
					   * * * * *
					    * * * *
					     * * *
					      * *
					       *
		    */
	
	static void pattern11(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= row - 1; space++) {
				System.out.print(" ");
			}
				for (int col = row; col <= n; col++) {
					System.out.print("* ");
				}
			System.out.println();
		}
	}
	// Pattern 12
	
				/*
						    * * * * *
						     * * * *
						      * * *
						       * *
						        *
						        *
						       * *
						      * * *
						     * * * *
						    * * * * *

			    */
	static void pattern12(int n) {
		for (int row = 1; row <= 2 * n; row++) {
			int correctSpace = row <= n ? row - 1 : 2 * n - row;
			for (int space = 1; space <= correctSpace; space++) {
				System.out.print(" ");
			}
			int correctCol = row <= n ? row : 2 * n - row + 1;
				for (int col = correctCol; col <= n; col++) {
					System.out.print("* ");
				}
			System.out.println();
		}
	}
	
}

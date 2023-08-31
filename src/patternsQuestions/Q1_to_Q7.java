package patternsQuestions;

public class Q1_to_Q7 {
	
	public static void main(String[] args) {
		/*
		pattern1(5);
		pattern2(5);
		pattern3(5);
		pattern4(5);
		pattern5(5);
		pattern6(5);
		*/
		pattern7(5);
	}
	
	// Pattern 1
	
			/*
					*****
					*****
					*****
					*****
					*****
		    */
	static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			// When row is printed, we need a new line
			System.out.println();
		}
	}
	// Pattern 2
	
		/*
				*
			    **
			    ***
			    ****
			    *****
	    */
	static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// When row is printed, we need a new line
			System.out.println();
		}
	}
	
	// Pattern 3
	
			/*
					*****
					****
					***
					**
					*
		    */
	static void pattern3(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col = row; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// Pattern 4
	
				/*
						1
    					1 2
					    1 2 3
					    1 2 3 4
					    1 2 3 4 5
			    */
	static void pattern4(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	// Pattern 5
	
	/*
			 *
		     **
		     ***
		     ****
		     *****
		     ****
		     ***
		     **
		     *
    */
	static void pattern5(int n) {
		for(int row = 1; row < 2 * n; row++) {
			// If row <= n, the c will be equal to row
			// Otherwise, 
			int correctColInRow = row <= n ? row : 2 * n - row;
			for(int col = 1; col <= correctColInRow; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// Pattern 6
	
		/*
				      *
				     **
				    ***
				   ****
				  *****
	    */
	static void pattern6(int n) {
		for(int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	// Pattern 7
	
			/*
					  *****
					   ****
				        ***
				         **
				          *
		    */
	static void pattern7(int n) {
		for(int row = 1; row <= n; row++) {
			for (int space = 1; space <= row - 1; space++) {
				System.out.print(" ");
			}
			for (int col = n; col >= row ; col--) { 
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}

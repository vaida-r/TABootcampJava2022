package sef.module2.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 8;
		int j = 5;
		
		// Subtract numbers
		int result = i-j;
		
		// Print result
		System.out.println("Difference = " + result);
		
		// Add numbers
		result = i + j;
		
		// Print result
		System.out.println("sum = " + result);

		result = i % j;
		System.out.println("modulo = " + result);

		result = i / j;
		System.out.println("dalyba = " + result);

		result = i ++;
		System.out.println("res++ = " + result);

		System.out.println("prefix = " + ++j);
	}

}

/**
 * 
 */
package sef.module2.activity;

/**
 * @author
 *
 */
public class FindLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Find Largest of two numbers
				
		int num1 = 1, num2 = 2;
		//Compares that num1 is greater than num2
		if (num1 > num2) {
			System.out.println(num1 + " is largest of two numbers");
		} else {
			System.out.println(num2 + " is largest of two numbers");
		}

		// Find Largest of three numbers
				
		int i = 11, j = 11, k = 10;
		//Compares that i is greater than j
		if (i > j) {
			if (i > k)
			{
				System.out.println(i + " is Largest of three numbers");
			} else {
				System.out.println(k+ " is Largest of three numbers");
			}
		} else {
			if (j > k)
			{
				System.out.println(j+ " is Largest of three numbers");
			} else {
				System.out.println(k+ " is Largest of three numbers");
			}
		}
		


	}

}

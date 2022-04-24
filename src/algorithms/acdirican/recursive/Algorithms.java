package algorithms.acdirican.recursive;

/**
 * 
 * @author AhmetCengizhan Dirican
 * @version 1.0
 *
 */
public class Algorithms {
	/**
	 * Factorial calculation using a recursive algorithm.
	 * 
	 * Recursive definition:
	 * f(n) = f(n -1) * n; 
	 */
	public int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n-1); 
	}
	
	/**
	 * Summing consecutive numbers between a and b, with a step size s;
	 * 
	 * Recursive definition:
	 * f(a,b,s) = f(a+s, b, s)  +  a; 
	 */
	public int sum(int a, int b, int s) {
		if (a < b) {
			return 0;
		}
		return a + sum(a+s, b, s); 
	}
	
	/**
	 * Searching in an array with a recursive algorithm.
	 */
	public int indexOf(int arr[], int value) {
		return indexOf(arr, 0, value);
	}

	/**
	 * Helper for searching in an array with a recursive algorithm.
	 * 
	 * Runtime Function:
	 * T(n) = T(n-1) + 1
	 */
	private int indexOf(int[] arr, int i, int value) {
		//Stop condition
		if (i == arr.length) {
			return -1; //value is not in the array
		}
		if (arr[i] == value) {
			return i;
		}
		return indexOf(arr, i+1, value);
	}
	
	
}

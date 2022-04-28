package algorithms.acdirican.recursive;

/**
 * This class includes the implemenations of recerive algorithms
 * 
 * @author Ahmet Cengizhan Dirican
 * @see https://github.com/acdirican
 */
public class Algorithms {
	/**
	 * Factorial calculation using a recursive algorithm.
	 * 
	 * Recursive definition:
	 * f(n) = f(n -1) * n; 
	 */
	public static int factorial(int n) {
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
	public static int sum(int a, int b, int s) {
		if (a > b) {
			return 0;
		}
		System.out.println(a);
		return a + sum(a+s, b, s); 
	}
	
	/**
	 * Searching in an array with a recursive algorithm.
	 */
	public static int indexOf(int arr[], int value) {
		return indexOf(arr, 0, value);
	}

	/**
	 * Helper for searching in an array with a recursive algorithm.
	 * 
	 * Runtime Function:
	 * T(n) = T(n-1) + 1
	 */
	private static int indexOf(int[] arr, int i, int value) {
		//Stop condition
		if (i == arr.length) {
			return -1; //value is not in the array
		}
		if (arr[i] == value) {
			return i;
		}
		return indexOf(arr, i+1, value);
	}
	

	/**
	 * Finds the sum of the elements of an array with a recursive algorithm.
	 */
	public static int sum(int arr[]) {
		return sum(arr, 0);
	}

	/**
	 * Helper for summing the elements of an array with a recursive algorithm.
	 * Runtime Definition:
	 * f(arr, n) = f(n-1) + arr[n] 
	 * 
	 * Runtime Function:
	 * T(n) = T(n-1) + 1
	 */
	private static int sum(int[] arr, int i) {
		//Stop condition
		if (i == arr.length) {
			return arr[0]; //Out of range
		}
		return arr[i] + sum(arr, i+1);
	}
	
	
	/*
	 * Euclid's greatest common divisor algorithm.
	 * 
	 * Recursive definition:
	 * gcd(m, n) = gcd(n, m mod n)
	 *  
	 */
	public static int gcd(int m, int n) {
		if (n == 0) {
			return m;
		}
		return gcd(n, m % n);
	}
	
}

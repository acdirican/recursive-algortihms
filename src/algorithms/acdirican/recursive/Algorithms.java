package algorithms.acdirican.recursive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

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
	
	/**
	 * Print all permutations of a char array
	 * 
	 * @param arr
	 * @return
	 */
	public static int printPermutations(char[] arr) {
		return printPermutations(arr, 0);
	}

	private static int printPermutations(char[] arr, int c) {
		if (c == arr.length) {
			System.out.println(arr);
			return 1;
		}
		int n = 0;
		for(int i =c; i<arr.length; i++) {
			swap(arr, c, i);
			n += printPermutations(arr, c + 1);
			swap(arr, i, c);
		}
		return n;
	}

	private static void swap(char[] arr, int c, int i) {
		char t = arr[c];
		arr[c] = arr[i];
		arr[i] = t;
		
	}
	
	/**
	 * Print all possible paths in a graph
	 * @param graph
	 * @return
	 */
	public static int printAllPaths(int[][] graph) {
		return printAllPaths(graph, 0, new LinkedHashSet<Integer>());
	}

	private static int printAllPaths(int[][] graph, int node, Set<Integer> visited) {
		if (visited.contains(node)) {
			return 0;
		}
		
		visited.add(node);
		
		boolean allVisited = true;
		for(int i=0; i<graph.length; i++) {
			if (!visited.contains(i)) {
				allVisited = false;
			}
		}
		if (allVisited) {
			System.out.println(visited);
			return 1;
		}

		
		int n = 0;
		for (int i=0; i<graph[node].length; i++) {
			int weight =  graph[node][i];
			if (weight != 0 && !visited.contains(i)) {
				n += printAllPaths(graph, i, new LinkedHashSet<Integer>(visited));
				System.out.println();
			}
			
		}
		return n;
	}
	
	/**
	 * Print all possible knapsack fits
	 * @param graph
	 * @return
	 */
	public static int printAllFits(int items[], int[] weights, int[] values, int W) {
		int n=0;
		//Let's try all combinations
		for (int r = 1; r <=values.length; r++) {
			// A temporary array to store all combination one by one
	        int data[]=new int[r];
			n += printAllFits(items, weights, values, W, data, 0, items.length-1, 0, r);
		}
		return n;
	}

	private static int printAllFits(int[] arr, int[] weights, int[] values, int W, int[] data, int start, int end, int current, int r) {
		// Current combination is ready to be printed, print it
        if (current == r) {
        	if (sumWeight(data, weights, r) == W) {
        		print(data, r);
        	}
            
            return 1;
        }
        
        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        int n=0;
        for (int i=start; i<=end && end-i+1 >= r-current; i++)
        {
            data[current] = arr[i];
            n += printAllFits(arr, weights, values, W, data, i+1, end, current+1, r);
        }
        
		return n;
	}
	
	private static void print(int[] arr, int r) {
		 for (int j=0; j<r; j++) {
             System.out.print(arr[j]+" ");
         }
         System.out.println("");
	}

	private static void swap(int[] arr, int c, int i) {
		int t = arr[c];
		arr[c] = arr[i];
		arr[i] = t;
		
	}

	private static int sumWeight(int[] arr, int[] weights, int r) {
		int s = 0;
		for (int i = 0; i < r; i++) {
			s += weights[arr[i]];

		}
		return s;
	}

	
}

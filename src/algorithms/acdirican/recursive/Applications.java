package algorithms.acdirican.recursive;

/**
 * This projects is indented to present the implementations of popular recursive algorithms 
 * and recurive versions of some iterative algorithms.
 * 
 * @author Ahmet Cengizhan Dirican
 * @see https://github.com/acdirican
 */
public class Applications {
	public static void main(String[] args) {
//		int n = Algorithms.printPermutations(new char[] {'a','b','c','d'});
//		System.out.println(n);
		
//		int[][] graph = {
//				{0,1,1,1},
//				{1,0,1,1},
//				{1,1,0,1},
//				{1,1,1,0}
//				
//		};
//		
//		int n = Algorithms.printAllPaths(graph);
//		System.out.println(n);
		
		
		int[] items =  {0,1,2,3,4,5,6,7,8};
		int[] weights= {2,4,3,10,7,6,6,8,12};
		int[] values = {8,6,15,9,4,11,12,3,6};
		int W = 30;
		int n = Algorithms.printAllFits(items, weights, values, W);
		System.out.println(n);
	}
}

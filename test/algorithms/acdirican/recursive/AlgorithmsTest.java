package algorithms.acdirican.recursive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlgorithmsTest {
	private int[] arr = {3, 0, 8,9,7,4,6,2,4, 21, 74, 12};
	@Test
	void testFactorial() {
		assertEquals(1, Algorithms.factorial(0));
		assertEquals(120, Algorithms.factorial(5));
	}

	@Test
	void testIndexOf() {
		assertEquals(-1, Algorithms.indexOf(arr, 85));
		assertEquals(3, Algorithms.indexOf(arr, 9));
	}

	@Test
	void testSum() {
		//2 + 4 + 6 + 8 + 10 + 12 + 14 + 16  + 18 +  20 = 
		assertEquals(92, Algorithms.sum(2, 20, 2)); 
	}
	
	@Test
	void testSumIntArray() {

		assertEquals(153, Algorithms.sum(arr));
	}

	@Test
	void testGcd() {
		assertEquals(30, Algorithms.gcd(90, 60));
	}

}

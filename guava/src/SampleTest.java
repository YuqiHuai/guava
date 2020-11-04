import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.google.common.math.DoubleMath;

class SampleTest {

	/**
	 * Should return true when k is a positive integer.
	 */
	@Test
	void kIsPositiveIntger() {
		Assertions.assertTrue(DoubleMath.isPowerOfTwo(2));  // k = 1
		// Alternatives
		// Assertions.assertTrue(DoubleMath.isPowerOfTwo(4));  // k = 2
		// Assertions.assertTrue(DoubleMath.isPowerOfTwo(8));  // k = 3
		// Assertions.assertTrue(DoubleMath.isPowerOfTwo(16)); // k = 4
		// TODO: substitute for Parameterized Testing for Assignment 2
	}
	@Test
	void kIsPositiveDouble() {
		Assertions.assertFalse(DoubleMath.isPowerOfTwo(Math.pow(2, 1.5))); // k = 1.5
		// Alternatives
		// Assertions.assertFalse(DoubleMath.isPowerOfTwo(Math.pow(2, 2.5))); // k = 2.5
		// Assertions.assertFalse(DoubleMath.isPowerOfTwo(Math.pow(2, 3.5))); // k = 3.5
		// Assertions.assertFalse(DoubleMath.isPowerOfTwo(Math.pow(2, 4.5))); // k = 4.5
		// TODO: substitute for Parameterized Testing for Assignment 2
	}
	
	@Test
	void kIsNegativeInteger() {
		Assertions.assertTrue(DoubleMath.isPowerOfTwo(0.5)); // k = -1
		// Alternatives
		// Assertions.assertTrue(DoubleMath.isPowerOfTwo(0.25)); // k = -2
		// Assertions.assertTrue(DoubleMath.isPowerOfTwo(0.125)); // k = -3
		// TODO: substitute for Parameterized Testing for Assignment 2
	}

	@Test
	void kIsNegativeDouble() {
		Assertions.assertFalse(DoubleMath.isPowerOfTwo(Math.pow(2, -1.5))); // k = - 1.5
		// Alternatives
		// Assertions.assertFalse(DoubleMath.isPowerOfTwo(Math.pow(2, -2.5))); // k = - 2.5
		// Assertions.assertFalse(DoubleMath.isPowerOfTwo(Math.pow(2, -3.5))); // k = - 3.5
		// Assertions.assertFalse(DoubleMath.isPowerOfTwo(Math.pow(2, -4.5))); // k = - 4.5
		// TODO: substitute for Parameterized Testing for Assignment 2
	}
	
	@Test
	void kIsZero() {
		boolean b = DoubleMath.isPowerOfTwo(1); // k = 0
		Assertions.assertTrue(b);
	}
}

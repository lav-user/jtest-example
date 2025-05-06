/**
 * 
 */
package examples.eval;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: Test class for Simple
 *
 * @see examples.eval.Simple
 * @author lesambadu
 */
public class SimpleTest {

	

	/**
	 * Parasoft Jtest UTA: Test for startsWith(String, String)
	 *
	 * @see examples.eval.Simple#startsWith(String, String)
	 */
	@Test
	public void testStartsWith2() throws Throwable {
		// When
		String str = "match"; // Updated to match the length of 'match'
		String match = "match"; // UTA: provided value
		boolean result = Simple.startsWith(str, match);

		// Then - assertions for result of method startsWith(String, String)
		assertFalse(result);
	}

	/**
	 * Parasoft Jtest UTA: Test for startsWith(String, String)
	 *
	 * @see examples.eval.Simple#startsWith(String, String)
	 * @author lesambadu
	 */
	@Test
	public void testStartsWith() throws Throwable {
		// When
		String str = "str"; // UTA: default value
		String match = ""; // UTA: provided value
		boolean result = Simple.startsWith(str, match);

		// Then - assertions for result of method startsWith(String, String)
		assertTrue(result);

	}

}

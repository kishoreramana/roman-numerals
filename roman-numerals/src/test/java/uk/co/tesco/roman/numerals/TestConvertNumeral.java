package uk.co.tesco.roman.numerals;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This is a JUnit test class to test the functionality of converting numerals
 * into roman numerals.
 * 
 * @author kishore ramana
 * @version 0.0.1
 * @since Aug 12 2016
 *
 */
public class TestConvertNumeral {

	private ConvertNumeral convertNumeral;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		convertNumeral = new ConvertNumeral();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertNull(convertNumeral.convert(1));
	}

}
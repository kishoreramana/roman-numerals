package uk.co.tesco.roman.numerals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

		convertNumeral = null;
	}

	@Test
	public void testNotNull() {
		assertNotNull(convertNumeral.convert(1));
	}

	@Test
	public void testLessThanZero() {
		assertEquals(CommonUtil.ERR_MSG_NUMBER_LESS_THAN_LOWER_LIMIT, convertNumeral.convert(-1));
	}

	@Test
	public void testEqualToZero() {
		assertEquals(CommonUtil.ERR_MSG_NUMBER_LESS_THAN_LOWER_LIMIT, convertNumeral.convert(0));
	}
	
	@Test
	public void testGreaterThanUpperLimit() {
		assertEquals(CommonUtil.ERR_MSG_NUMBER_GREATER_THAN_UPPER_LIMIT, convertNumeral.convert(4000));
	}
	

}
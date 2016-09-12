package uk.co.tesco.roman.numerals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a JUnit test class to test the functionality of converting integers
 * (ranging from 1 till 3999) into their corresponding roman numerals.
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

	@Test
	public void testEqualTo64() {
		assertEquals("LXIV", convertNumeral.convert(64));
	}

	@Test
	public void testEqualTo226() {
		assertEquals("CCXXVI", convertNumeral.convert(226));
	}

	@Test
	public void testEqualTo990() {
		assertEquals("CM", convertNumeral.convert(900));
	}

	@Test
	public void testEqualTo998() {
		assertEquals("CMXCVIII", convertNumeral.convert(998));
	}

	@Test
	public void testEqualTo1712() {
		assertEquals("MDCCXII", convertNumeral.convert(1712));
	}

	@Test
	public void testEqualTo3992() {
		assertEquals("MMMCMXCII", convertNumeral.convert(3992));
	}

	@Test
	public void testEqualTo3999() {
		assertEquals("MMMCMXCIX", convertNumeral.convert(3999));
	}

}
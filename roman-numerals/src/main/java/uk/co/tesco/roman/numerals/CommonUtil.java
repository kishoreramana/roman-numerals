package uk.co.tesco.roman.numerals;

/**
 * This is an utility class for roman numerals conversion.
 * 
 * @author kishore ramana
 * @version 0.0.1
 * @since Aug 12 2016
 *
 */
public class CommonUtil {

	public static final int ROMAN_NUMERAL_LOWER_LIMIT = 1;

	public static final int ROMAN_NUMERAL_UPPER_LIMIT = 3999;

	public static final String ERR_MSG_INVALID_NUMBER = "Number should not be less than zero. Please enter a valid number between "
			+ ROMAN_NUMERAL_LOWER_LIMIT + " and " + ROMAN_NUMERAL_UPPER_LIMIT + "";

	public static final String ERR_MSG_NUMBER_LESS_THAN_LOWER_LIMIT = "Number should not be less than "
			+ ROMAN_NUMERAL_LOWER_LIMIT + ". " + ERR_MSG_INVALID_NUMBER;

	public static final String ERR_MSG_NUMBER_GREATER_THAN_UPPER_LIMIT = "Number should not be greater than "
			+ ROMAN_NUMERAL_UPPER_LIMIT + ". " + ERR_MSG_INVALID_NUMBER;

}

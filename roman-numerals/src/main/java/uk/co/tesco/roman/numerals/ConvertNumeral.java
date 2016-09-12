package uk.co.tesco.roman.numerals;

/**
 * This class converts an integer into its corresponding roman numeral.
 * 
 * @author kishore ramana
 * @version 0.0.1
 * @since Aug 12 2016
 *
 */
public class ConvertNumeral {

	/**
	 * Method to convert an {@link int} into its corresponding roman numeral.
	 * 
	 * @param numeral
	 *            - An {@link int} to convert.
	 * @return - A String containing its corresponding roman numeral or null if
	 *         unable to convert.
	 */
	public String convert(int numeral) {
		String result = null;

		if (numeral < CommonUtil.ROMAN_NUMERAL_LOWER_LIMIT) {
			result = CommonUtil.ERR_NUMBER_LESS_THAN_LOWER_LIMIT;
		} else if (numeral > CommonUtil.ROMAN_NUMERAL_UPPER_LIMIT) {
			result = CommonUtil.ERR_NUMBER_GREATER_THAN_UPPER_LIMIT;
		} else {
			
		}
		return result;
	}

}

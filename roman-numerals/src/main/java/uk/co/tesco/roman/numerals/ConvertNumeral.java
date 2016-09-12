package uk.co.tesco.roman.numerals;

/**
 * This class converts an integer (ranging from 1 till 3999) into its
 * corresponding roman numeral.
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
	 * @return - A String containing its corresponding roman numeral or
	 *         null/error message if unable to convert.
	 */
	public String toRoman(int numeral) {
		String result = null;
		StringBuilder tempBuffer = null;
		final RomanNumerals[] values;

		if (numeral < CommonUtil.ROMAN_NUMERAL_LOWER_LIMIT) {
			// Return a message that number is less than lower limit of roman
			// numerals.
			result = CommonUtil.ERR_MSG_NUMBER_LESS_THAN_LOWER_LIMIT;
		} else if (numeral > CommonUtil.ROMAN_NUMERAL_UPPER_LIMIT) {
			// Return a message that number is greater than upper limit of roman
			// numerals.
			result = CommonUtil.ERR_MSG_NUMBER_GREATER_THAN_UPPER_LIMIT;
		} else {
			// Return the roman number for a valid integer between lower and
			// upper limit of roman numerals.

			// Temporary Buffer (StringBuilder object) to concatenate resultant
			// strings in the conversion process.
			tempBuffer = new StringBuilder();
			// Values of the RomanNumerals enum.
			values = RomanNumerals.values();

			// Loop - through the values of enum.
			for (int i = values.length - 1; i >= 0; i--) {
				// Loop - until the numeral is greater than values in the enum.
				while (numeral >= values[i].weight) {
					// Append enum values to the temporary buffer.
					tempBuffer.append(values[i]);
					// Decrement the numeral by i th value of the enum for next
					// processing in the loop.
					numeral -= values[i].weight;
				}
			}
			// Convert the temporary buffer into result string.
			result = tempBuffer.toString();
		}
		return result;
	}
}
package exercises;

/**
 * @author Shlomi
 * @exercise 1 for Taldor
 */
public class Exc1 {

	@SuppressWarnings("javadoc")
	public static void main(String[] args) {

		// approach 1
		System.out.println(reverseNumber1(100));

		// approach 2
		System.out.println(reverseNumber2(100));
	}

	/**
	 * @param num
	 * @Function reverse number using string builder
	 */
	public static String reverseNumber1(int num) {
		String number = String.valueOf(num);
		StringBuilder sb = new StringBuilder(number);
		return ("approach 1 : " + sb.reverse());
	}

	/**
	 * @param num
	 * @Function reverse number using for loop
	 */
	public static String reverseNumber2(int num) {
		String number = String.valueOf(num);
		String reverseNum = "";
		char[] array = number.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			reverseNum = reverseNum + array[i];
		}
		return ("approach 2 : " + reverseNum);
	}

}

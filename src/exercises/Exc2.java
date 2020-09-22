package exercises;
/**
 * @author Shlomi
 * @exercise 2 for Taldor
 */
public class Exc2 {

	@SuppressWarnings("javadoc")
	public static void main(String[] args) {
		System.out.println(reverseDoubleNumber(123.45));
	}

	/**
	 * @param num
	 * @Function return reverse double number
	 */
	public static String reverseDoubleNumber(double num) {
		String [] arrNum = String.valueOf(num).split("\\.");
		return (arrNum[1]+"."+arrNum[0]);

	}

}

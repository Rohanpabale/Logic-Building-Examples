package Logic_Building;

public class Palindrome_Number {
	public static void main(String[] args) {

		int number = 123321;
		int temp = number; // need temp variable for perform operation
		int reverse = 0;
		while (temp != 0) {
			int lastdigit = temp % 10;// last digit
			reverse = (reverse * 10) + lastdigit; // digit add in reverse
			temp = temp / 10; // remove that last digit
		}

		if (number == reverse) // compare with number
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}

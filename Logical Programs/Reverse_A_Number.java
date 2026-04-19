package Logic_Building;

public class Reverse_A_Number {
	public static void main(String[] args) {
		int number = 1723;
		int rev = 0;

		// while loop
		while (number != 0) {
			int digit = number % 10; // last number find
			rev = rev * 10 + digit;// adding the last number in rev ----- rev*10 dashank shifting sathi
			number = number / 10; // remove the last number after reversing
		}
		System.out.println(rev);
	}
}

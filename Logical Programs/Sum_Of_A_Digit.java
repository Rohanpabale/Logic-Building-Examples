package Logic_Building;

public class Sum_Of_A_Digit {
	public static void main(String[] args) {
		int num = 432;
		int sum = 0;
		while (num != 0) {
			int last_digit = num % 10; // find last number and add it in sum
			sum = sum + last_digit;
			num = num / 10; // removing last number
		}
		System.out.println(sum);
	}
}

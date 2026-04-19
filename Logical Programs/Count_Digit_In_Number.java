package Logic_Building;

public class Count_Digit_In_Number {
	public static void main(String[] args) {
		int number = 1234;
		int count = 0;
		while (number != 0) {
			number = number / 10; // remove last digit
			count++; // digit removing till number <=0 and increaing count
		}
		System.out.println(count);
	}
}

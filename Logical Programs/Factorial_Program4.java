package Logic_Building;

import java.util.Scanner;

// using recursion
public class Factorial_Program4 {
	public static int factorial(int number) {
		if (number == 1)
			return 1;
		return number * factorial(number - 1); // factorial method calling itself
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println(factorial(number));
	}
}

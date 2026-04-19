package Logic_Building;

import java.util.Scanner;

// factorial program using for loop
public class Factorial_Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to print its factorial");
		int number = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
			System.out.print(" " + i);
		}
		System.out.println(" = " + factorial);
	}
}

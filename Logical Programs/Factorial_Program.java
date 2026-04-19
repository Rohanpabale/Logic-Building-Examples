package java_T_Point_Basic;

import java.util.Scanner;

public class Factorial_Program {
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

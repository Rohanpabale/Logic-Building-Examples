package java_T_Point_Basic;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber = 0;
		System.out.println("enter max number");
		int n = sc.nextInt();
		while (nextNumber < n) {
			System.out.println(nextNumber);
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			nextNumber = firstNumber + secondNumber;
		}
	}
}

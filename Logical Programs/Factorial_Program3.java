package Logic_Building;

import java.util.Scanner;

//using do while loop
public class Factorial_Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		int factorial = 1;
		int i = 1;
		do {
			factorial = factorial * i;
			i++;
		} while (i <= number);
		System.out.println(factorial);
	}
}

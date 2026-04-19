package Diwali_Task;

import java.util.Scanner;

public class Check_Number_Is_Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check prime or not");
		int number = sc.nextInt();

		if (number <= 2 && number > 0)
			System.out.println("number is prime");
		else if (number % 3 == 0 || number % 4 == 0)
			System.out.println("number is not a prime number");
		else
			System.out.println("number is prime");

	}

}

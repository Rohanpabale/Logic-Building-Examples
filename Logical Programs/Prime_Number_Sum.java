package Diwali_Task;

import java.util.Scanner;

public class Prime_Number_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the last number");
		int lastNumber = sc.nextInt();
		int sum = 0;

		for (int number = 0; number <= lastNumber; number++) {
			int count = 0;

			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(number + " number is prime");
				sum = sum + number;
			}

		}
		System.out.println("the total sum of prime number from 1 to " + lastNumber + " is " + sum);
	}
}

package Diwali_Task;

import java.util.Scanner;

public class Count_Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the last number");
		int lastNumber = sc.nextInt();
		int primeCount = 0;

		for (int number = 0; number <= lastNumber; number++) {
			int count = 0;
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					count++;
				}
			}
		//	if (count != 2) {
		//		System.out.println(number + " is not a prime number");
		//	}
			if (count == 2) {
				System.out.println(number + " is a prime number");
				primeCount++;
			}
		}

		System.out.println("total count of prime numbers between 1 to " + lastNumber + " is " + primeCount);
	}
}

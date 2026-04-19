package Diwali_Task;

import java.util.Scanner;

public class Sum_Of_First_N_Natural_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the last number");
		int lastNumber = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= lastNumber; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("sum of first " + lastNumber + " natural numbers " + sum);
	}
}

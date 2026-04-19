package Diwali_Task;

import java.util.Scanner;

public class To_Print_Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to print table");
		int number = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
	}
}

package Diwali_Task;

import java.util.Scanner;

public class Print_Odd_Numbers_From_1_To_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter last number");
		int lastNumber = sc.nextInt();
		System.out.println("odd numbers from 1 to " + lastNumber + " are as follows:-");

		for (int i = 1; i <= lastNumber; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}

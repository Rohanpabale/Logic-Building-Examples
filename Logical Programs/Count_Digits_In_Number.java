package Diwali_Task;

import java.util.Scanner;

public class Count_Digits_In_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a digit");
		int number = sc.nextInt();
		int count = String.valueOf(number).length();
		System.out.println("the digit contains in a number " + number + " is " + count);

	}
}

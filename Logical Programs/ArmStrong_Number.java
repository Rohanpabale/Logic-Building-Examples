package java_T_Point_Basic;

import java.util.Scanner;

public class ArmStrong_Number {
	public static void main(String[] args) {
		int number = 153;
		int temp = number;
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			sum = sum + (digit * digit * digit);
			number = number / 10;
		}
		if (sum == temp)
			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
	}
}

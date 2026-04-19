package Diwali_Task;

import java.util.Scanner;

public class To_Check_Sum_Of_Array_Elements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();

		int[] arr = new int[size];
		int sum = 0;

		for (int i = 0; i < size; i++) {
			System.out.println("enter arrays " + i + " index element");
			arr[i] = sc.nextInt();

			sum = sum + arr[i];
		}
		System.out.println("the sum of the array elements is " + sum);
	}
}

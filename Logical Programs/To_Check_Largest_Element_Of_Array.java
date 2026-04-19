package Diwali_Task;

import java.util.Scanner;

public class To_Check_Largest_Element_Of_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("enter arrays " + i + " index element");
			arr[i] = sc.nextInt();
		}

		int largest = arr[0]; // assume first element is largest

		for (int i = 1; i < size; i++) {
			if (arr[i] > largest) {
				largest = arr[i];

			}
		}
		System.out.println("largest element is " + largest);
	}
}

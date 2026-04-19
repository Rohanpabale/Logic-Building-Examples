package Diwali_Task;

import java.util.Scanner;

public class Count_Vowels_And_Conconent {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the letters");
		String letters = sc.next().toLowerCase();
		int vowelCount = 0;
		int consonentCount = 0;

		for (int i = 0; i < letters.length(); i++) {
			char ch = letters.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					System.out.println(ch + " is a vowel");
					vowelCount++;
				} else {
					System.out.println(ch + " is a consonent");
					consonentCount++;
				}

			}
		}
		System.out.println("count of vowels is " + vowelCount);
		System.out.println("count consonents is " + consonentCount);
	}
}
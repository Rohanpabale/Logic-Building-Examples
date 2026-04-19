package Logic_Building;

import java.util.Arrays;

public class String_Anagram {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		// convert string objects in char array[]
		char arr[] = s1.toCharArray();
		char arr1[] = s2.toCharArray();

		// sort the both char arrays
		Arrays.sort(arr);
		Arrays.sort(arr1);

		// check the both sorted array are equal by using the
		// arrays.equal(char[],char2[])
		if (Arrays.equals(arr, arr1))
			System.out.println("anagram");
		else
			System.out.println("not anagram");

	}
}

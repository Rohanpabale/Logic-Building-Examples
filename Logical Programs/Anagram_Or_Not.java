package stringClass;

import java.util.Arrays;

public class Anagram_Or_Not {
	public static void main(String[] args) {
		String s1 = "elbow";
		String s2 = "below";

		// first check length
		if (s1.length() == s2.length()) {
			// convert the string into the array
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();

			// sort the both array
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			// equality check
			if (Arrays.equals(arr1, arr2))
				;
			System.out.println("anagram");

		} else {
			System.out.println("not anagram");
		}

	}
}

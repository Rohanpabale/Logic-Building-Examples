package Logic_Building;

public class Count_Vowel_Consonent {
	public static void main(String[] args) {
		String s = "behaviour";
		int vowelCount = 0;
		int consonentCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u')
				vowelCount++;
			else
				consonentCount++;

		}
		System.out.println("vowels count is " + vowelCount);
		System.out.println("consonent count is " + consonentCount);

	}
}

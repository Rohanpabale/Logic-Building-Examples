package Logic_Building;

public class Duplicate_Char_In_String {
	public static void main(String[] args) {
		String s = "india";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					System.out.println("duplicate found : " + s.charAt(i));
			}
		}
	}
}

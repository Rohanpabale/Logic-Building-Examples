package java_T_Point_Basic;

public class String_Palindrome {
	public static void main(String[] args) {
		String word = "level";
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			char character = word.charAt(i);
			rev = rev + character;
		}
		if (word.equals(rev)) {
			System.out.println("palindrome");
		} else
			System.out.println("not palindrome");
	}
}

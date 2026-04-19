package stringClass;

public class Check_String_Rotation {
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "cdab";
		String temp = s1 + s1;
		if (temp.contains(s2))
			System.out.println("rotation");
		else
			System.out.println("not rotation");

	}
}

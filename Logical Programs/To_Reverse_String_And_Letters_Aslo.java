package Logic_Building;

public class To_Reverse_String_And_Letters_Aslo {
	public static void main(String[] args) {
		String s = "i am rohan pabale";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);
	}
}

package Logic_Building;

public class Count_Spaces_String {
	public static void main(String[] args) {
		String s = "wagholi pune maharashtra";
		int spaceCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				spaceCount++;
		}
		System.out.println(spaceCount);
	}
}

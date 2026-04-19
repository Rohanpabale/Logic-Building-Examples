package Pattern_Programs;

public class Pattern_2 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

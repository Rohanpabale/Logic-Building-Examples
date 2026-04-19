package Star_Pattern;

public class Pattern4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {

			// spaces starts from the second row hence j=2
			for (int j = 2; j <= i; j++) {
				System.out.print("_");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

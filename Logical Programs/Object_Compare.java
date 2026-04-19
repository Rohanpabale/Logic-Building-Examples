package java_T_Point_Basic;

public class Object_Compare {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");

		System.out.println(s1 == s2);// false reference comparision SCP concept
		System.out.println(s1.equals(s2));// true content comparision
	}

}

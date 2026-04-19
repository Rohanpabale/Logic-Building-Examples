package Logic_Building;

import java.util.Scanner;

public class To_Swap_Two_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number a = ");
		int a = sc.nextInt();
		System.out.println("enter second number b = ");
		int b = sc.nextInt();
		System.out.println("before swapping a = " + a + " b = " + b);
//-----------------------------------------------------------------------------
		// logic 1---> using third variable
		// a=10 b=20
	
		/*
		 * int temp; temp = a; // temp=10 a = b; // a=20 ---> a is swapped now b = temp;
		 * // b=temp(10)---> now b is swapped System.out.println(" after swapping a = "
		 * + a + " b = " + b);
		 */

		// ---------------------------------------------------------------------------
		// logic 2----> without using third variable
	
		/*
		 * a = a + b; // a=30 b = a - b;// 30-20=10----> b swapped now a = a - b;//
		 * 30-10(latest value of b) =20----> a swapped now
		 * System.out.println(" after swapping a = " + a + " b = " + b);
		 */
		
		//----------------------------------------------------------------------
		//logic 3------> single line swapping but dont select 0 number 
	
		/*
		 * b=a+b-(a=b); // 10+20-(a=b---> a=20); b=10 and we assign a=b(20) so the
		 * latest value of a is 20 System.out.println(" after swapping a = " + a +
		 * " b = " + b);
		 */
		
		//-------------------------------------------------------------
		//logic 4-----> using * and / without third variable
		a=a*b;// a=200
		b=a/b; //200/20 b=10; b swapped now
		a=a/b; //200/10(latest value of b) a = 20 now
		System.out.println(" after swapping a = " + a + " b = " + b);
		
	}
}

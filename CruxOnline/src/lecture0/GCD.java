package lecture0;

//THIS CODE DOESNT WORK

import java.util.Scanner;

public class GCD {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter Divident  ");

		int a = scn.nextInt();

//		System.out.println();
		System.out.print("Enter Divisor  ");
//		System.out.println();
		int b = scn.nextInt();

		boolean flag = true;
		while (flag == true) {
			int divident = a;
			int divisor = b;
			int rem = divident % divisor;
			divisor = divident;
			rem = divisor;
			System.out.println(divident + divisor);
			if (rem == 0) {
				flag = false;
				break;
			}
		}

	}

}

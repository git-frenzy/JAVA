package lecture0;

import java.util.Scanner;

public class Prime {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();

		int divisor = 2;
		boolean flag = true;

		while (divisor <= n - 1) {

			if (n % divisor == 0) {
				flag = false;
			}

			divisor = divisor + 1;
		}
		if (flag == true) {

			System.out.println("Prime");

		} else {
			System.out.println("non prime");
		}
	}

}

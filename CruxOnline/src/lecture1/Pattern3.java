package lecture1;

import java.util.Scanner;

public class Pattern3 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		int n = scn.nextInt();

		int row = 1;
		int nst = n;

		while (row <= n) {

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			System.out.println();
			nst--;
			row++;
		}

	}
}
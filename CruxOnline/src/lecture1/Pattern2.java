package lecture1;

import java.util.Scanner;

public class Pattern2 {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();

		int row = 1;
		int nst = 1; // nst - number of stars

		while (row <= n) {
			int cst = 1; // cst - count of stars
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			System.out.println();
			nst++;
			row++;

		}

	}
}
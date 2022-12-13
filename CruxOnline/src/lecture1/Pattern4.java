//INCOMPLETE QUESTION
package lecture1;

import java.util.Scanner;

public class Pattern4 {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		int n = scn.nextInt();

		int nst = 1; // number of stars
		int nsp = n - 1; // number of spaces

		int row = 1; // number of rows
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.println("*");
				cst++;
			}
			System.out.println();
			nst++;
			nsp--;
			row++;
		}

	}

}

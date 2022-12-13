package lecture1;

import java.util.Scanner;

public class Pattern1 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {


		int n = scn.nextInt();
		int row = 1;
		
		while (row <= n) {
			int col = 1;
			while (col <= n) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}
}
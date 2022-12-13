package lecture1;

import java.util.Scanner;

public class Pattern0_1 {
	
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scn.nextInt();
		int row = 1;
		while (row <= n) {
			System.out.print("*");
			System.out.println();
			row++;

		}

	}
}

package lecture1;

import java.util.Scanner;

public class Pattern0 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		for (int row = 1; row <= n; row++) {
			System.out.print("*");
			System.out.println("");
		}

	}

}
